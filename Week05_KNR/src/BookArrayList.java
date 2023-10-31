import java.util.ArrayList; // ArrayList�� ����ϱ� ���� import ��

public class BookArrayList {
    private ArrayList<Book> arrayList; // Book ��ü�� ������ ArrayList

    // BookArrayList Ŭ������ ������
    public BookArrayList() {
        arrayList = new ArrayList<Book>(); // Book ��ü�� ������ �� ArrayList�� ����
    }

    // Book ��ü�� ArrayList�� �߰��ϴ� �޼���
    public void addBook(Book book) {
        arrayList.add(book); // ���޵� Book ��ü�� ArrayList�� �߰�
    }

    // ������ BookId�� �ش��ϴ� å�� ArrayList���� �����ϴ� �޼���
    public boolean removeBook(int BookId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Book book = arrayList.get(i); // ArrayList���� i��° Book ��ü�� ������
            int tempId = book.getBookId(); // Book ��ü�� ���̵� ������
            if (tempId == BookId) { // ���̵� ��ġ�ϸ�
                arrayList.remove(i); // ArrayList���� �ش� Book ��ü�� ����
                return true; // ���������� ���ŵǾ����� ��Ÿ���� true ��ȯ
            }
        }
        System.out.println(BookId + "�� �������� �ʽ��ϴ�."); // ������ ���̵��� å�� ���� ��� �޽��� ���
        return false; // ���̵� �ش��ϴ� å�� ������ ��Ÿ���� false ��ȯ
    }

    // Ư�� ��ġ�� Book ��ü�� �߰��ϴ� �޼���
    public void insertBook(int index, Book book) {
        arrayList.add(index, book); // ������ �ε��� ��ġ�� Book ��ü�� �߰�
    }

    // ArrayList�� �ִ� ��� å ������ ����ϴ� �޼���
    public void showAllBook() {
        for (Book book : arrayList) { // ArrayList�� �ִ� ��� Book ��ü�� ���� �ݺ�
            System.out.println(book); // �� Book ��ü�� ���
        }
        System.out.println(); // ��� å ���� ��� �� �� �� �߰�
    }
}
