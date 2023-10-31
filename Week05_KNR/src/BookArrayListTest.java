import java.util.Scanner; // Scanner�� ����ϱ� ���� import ��

public class BookArrayListTest {
    public static void main(String[] args) {
        BookArrayList bookArrayList = new BookArrayList(); // BookArrayList ��ü ����

        // �ټ� ���� å ��ü ����
        Book book1 = new Book(0001, "�Ŀ콺Ʈ");
        Book book2 = new Book(0002, "Ȳ����");
        Book book3 = new Book(0003, "����");
        Book book4 = new Book(0004, "�ȼǵ�");
        Book book5 = new Book(0005, "�罺����");

        // ������ å ��ü���� BookArrayList�� �߰�
        bookArrayList.addBook(book1);
        bookArrayList.addBook(book2);
        bookArrayList.addBook(book3);
        bookArrayList.addBook(book4);
        bookArrayList.addBook(book5);

        bookArrayList.showAllBook(); // ��ü å ���

        // Ű����κ��� ��ġ, å ID, å ������ �Է¹޾� �߰�
        Scanner sc = new Scanner(System.in);
        System.out.print("�߰��� å�� ��ġ�� �Է��ϼ���: ");
        int insertIndex = sc.nextInt(); // ��ġ �Է�

        System.out.print("�߰��� å�� ID�� �Է��ϼ���: ");
        int bookId = sc.nextInt(); // å ID �Է�

        System.out.print("�߰��� å�� ������ �Է��ϼ���: ");
        sc.nextLine(); // ���� Ű �Է� ó��
        String title = sc.nextLine(); // å ���� �Է�

        // ���ο� å ��ü ����
        Book newBook = new Book(bookId, title);

        // �Է¹��� ��ġ�� ���ο� å�� �߰�
        bookArrayList.insertBook(insertIndex, newBook);

        bookArrayList.showAllBook(); // ��� å ���

        sc.close(); // Scanner ��ü �ݱ�
    }
}
