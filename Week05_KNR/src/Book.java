public class Book {
    private int BookId; // å�� ���̵� �����ϴ� ����
    private String BookName; // å�� �̸��� �����ϴ� ����

    // Book Ŭ������ ������. å�� ���̵�� �̸��� �Ű������� �޾� �ʱ�ȭ
    public Book(int BookId, String BookName) {
        this.BookId = BookId; // BookId ��� ������ �ʱ�ȭ
        this.BookName = BookName; // BookName ��� ������ �ʱ�ȭ
    }

    // å�� ���̵� ��ȯ�ϴ� �޼���
    public int getBookId() {
        return BookId; // BookId ������ ���� ��ȯ
    }

    // å�� ���̵� �����ϴ� �޼���
    public void setBookId(int BookId) {
        this.BookId = BookId; // BookId ������ �Ű������� ����
    }

    // å�� �̸��� ��ȯ�ϴ� �޼���
    public String getBookName() {
        return BookName; // BookName ������ ���� ��ȯ
    }

    // å�� �̸��� �����ϴ� �޼���
    public void setBookName(String BookName) {
        this.BookName = BookName; // BookName ������ �Ű������� ����
    }

    // ��ü�� ���ڿ��� ǥ���ϴ� �޼���
    @Override
    public String toString() {
        return BookName + "������ ���̵�� " + BookId + "�Դϴ�"; // å�� �̸��� ���̵� ���ڿ��� ��ȯ
    }
}
