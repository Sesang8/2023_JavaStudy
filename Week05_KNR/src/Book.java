public class Book {
    private int BookId; // 책의 아이디를 저장하는 변수
    private String BookName; // 책의 이름을 저장하는 변수

    // Book 클래스의 생성자. 책의 아이디와 이름을 매개변수로 받아 초기화
    public Book(int BookId, String BookName) {
        this.BookId = BookId; // BookId 멤버 변수를 초기화
        this.BookName = BookName; // BookName 멤버 변수를 초기화
    }

    // 책의 아이디를 반환하는 메서드
    public int getBookId() {
        return BookId; // BookId 변수의 값을 반환
    }

    // 책의 아이디를 설정하는 메서드
    public void setBookId(int BookId) {
        this.BookId = BookId; // BookId 변수를 매개변수로 설정
    }

    // 책의 이름을 반환하는 메서드
    public String getBookName() {
        return BookName; // BookName 변수의 값을 반환
    }

    // 책의 이름을 설정하는 메서드
    public void setBookName(String BookName) {
        this.BookName = BookName; // BookName 변수를 매개변수로 설정
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return BookName + "도서의 아이디는 " + BookId + "입니다"; // 책의 이름과 아이디를 문자열로 반환
    }
}
