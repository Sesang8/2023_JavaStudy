import java.util.Scanner;

public class BookArrayListTest {
	public static void main(String[] args) {
		BookArrayList bookArrayList = new BookArrayList();
		
		Book book1 = new Book(0001, "파우스트");
		Book book2 = new Book(0002, "황무지");
		Book book3 = new Book(0003, "변신");
		Book book4 = new Book(0004, "픽션들");
		Book book5 = new Book(0005, "톨스토이");

		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);
		bookArrayList.addBook(book5);
		
		bookArrayList.showAllBook(); // 전체 책 출력
		
		//키보드로 위치와 책 ID, 책 제목을 입력 받아서 추가 
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 책의 위치를 입력하세요: ");
        int insertIndex = sc.nextInt();

        System.out.print("추가할 책의 ID를 입력하세요: ");
        int bookId = sc.nextInt();

        System.out.print("추가할 책의 제목을 입력하세요: ");
        sc.nextLine(); 
        String title = sc.nextLine();
		
		Book newBook = new Book(bookId, title);
		bookArrayList.insertBook(insertIndex, newBook);
		
		bookArrayList.showAllBook();
		
		sc.close();
	}

}
