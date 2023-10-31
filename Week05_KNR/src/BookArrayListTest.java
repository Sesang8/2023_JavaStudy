import java.util.Scanner; // Scanner를 사용하기 위한 import 문

public class BookArrayListTest {
    public static void main(String[] args) {
        BookArrayList bookArrayList = new BookArrayList(); // BookArrayList 객체 생성

        // 다섯 권의 책 객체 생성
        Book book1 = new Book(0001, "파우스트");
        Book book2 = new Book(0002, "황무지");
        Book book3 = new Book(0003, "변신");
        Book book4 = new Book(0004, "픽션들");
        Book book5 = new Book(0005, "톨스토이");

        // 생성된 책 객체들을 BookArrayList에 추가
        bookArrayList.addBook(book1);
        bookArrayList.addBook(book2);
        bookArrayList.addBook(book3);
        bookArrayList.addBook(book4);
        bookArrayList.addBook(book5);

        bookArrayList.showAllBook(); // 전체 책 출력

        // 키보드로부터 위치, 책 ID, 책 제목을 입력받아 추가
        Scanner sc = new Scanner(System.in);
        System.out.print("추가할 책의 위치를 입력하세요: ");
        int insertIndex = sc.nextInt(); // 위치 입력

        System.out.print("추가할 책의 ID를 입력하세요: ");
        int bookId = sc.nextInt(); // 책 ID 입력

        System.out.print("추가할 책의 제목을 입력하세요: ");
        sc.nextLine(); // 엔터 키 입력 처리
        String title = sc.nextLine(); // 책 제목 입력

        // 새로운 책 객체 생성
        Book newBook = new Book(bookId, title);

        // 입력받은 위치에 새로운 책을 추가
        bookArrayList.insertBook(insertIndex, newBook);

        bookArrayList.showAllBook(); // 모든 책 출력

        sc.close(); // Scanner 객체 닫기
    }
}
