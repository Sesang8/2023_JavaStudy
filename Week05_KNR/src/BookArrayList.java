import java.util.ArrayList;

public class BookArrayList {
	private ArrayList<Book> arrayList;
	
	public BookArrayList() {
		arrayList = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		arrayList.add(book);
	}
	
	public boolean removeBook(int BookId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Book book = arrayList.get(i);
			int tempId = book.getBookId();
			if(tempId == BookId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(BookId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 여기 작성 -> insertBook(): 특정 위치를 입력받아 책 정보 추가 //
	public void insertBook(int index, Book book) {
	        arrayList.add(index, book);
    }

	
	
	public void showAllBook() {
		for(Book book : arrayList) {
			System.out.println(book);
		}
		System.out.println();
	}
}
