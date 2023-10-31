import java.util.ArrayList; // ArrayList를 사용하기 위한 import 문

public class BookArrayList {
    private ArrayList<Book> arrayList; // Book 객체를 저장할 ArrayList

    // BookArrayList 클래스의 생성자
    public BookArrayList() {
        arrayList = new ArrayList<Book>(); // Book 객체를 저장할 빈 ArrayList를 생성
    }

    // Book 객체를 ArrayList에 추가하는 메서드
    public void addBook(Book book) {
        arrayList.add(book); // 전달된 Book 객체를 ArrayList에 추가
    }

    // 지정된 BookId에 해당하는 책을 ArrayList에서 제거하는 메서드
    public boolean removeBook(int BookId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Book book = arrayList.get(i); // ArrayList에서 i번째 Book 객체를 가져옴
            int tempId = book.getBookId(); // Book 객체의 아이디를 가져옴
            if (tempId == BookId) { // 아이디가 일치하면
                arrayList.remove(i); // ArrayList에서 해당 Book 객체를 제거
                return true; // 성공적으로 제거되었음을 나타내는 true 반환
            }
        }
        System.out.println(BookId + "가 존재하지 않습니다."); // 지정된 아이디의 책이 없을 경우 메시지 출력
        return false; // 아이디에 해당하는 책이 없음을 나타내는 false 반환
    }

    // 특정 위치에 Book 객체를 추가하는 메서드
    public void insertBook(int index, Book book) {
        arrayList.add(index, book); // 지정된 인덱스 위치에 Book 객체를 추가
    }

    // ArrayList에 있는 모든 책 정보를 출력하는 메서드
    public void showAllBook() {
        for (Book book : arrayList) { // ArrayList에 있는 모든 Book 객체에 대해 반복
            System.out.println(book); // 각 Book 객체를 출력
        }
        System.out.println(); // 모든 책 정보 출력 후 빈 줄 추가
    }
}
