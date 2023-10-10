import java.util.Scanner;

public class BookArrayListTest {
	public static void main(String[] args) {
		BookArrayList bookArrayList = new BookArrayList();
		
		Book book1 = new Book(0001, "�Ŀ콺Ʈ");
		Book book2 = new Book(0002, "Ȳ����");
		Book book3 = new Book(0003, "����");
		Book book4 = new Book(0004, "�ȼǵ�");
		Book book5 = new Book(0005, "�罺����");

		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);
		bookArrayList.addBook(book5);
		
		bookArrayList.showAllBook(); // ��ü å ���
		
		//Ű����� ��ġ�� å ID, å ������ �Է� �޾Ƽ� �߰� 
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰��� å�� ��ġ�� �Է��ϼ���: ");
        int insertIndex = sc.nextInt();

        System.out.print("�߰��� å�� ID�� �Է��ϼ���: ");
        int bookId = sc.nextInt();

        System.out.print("�߰��� å�� ������ �Է��ϼ���: ");
        sc.nextLine(); 
        String title = sc.nextLine();
		
		Book newBook = new Book(bookId, title);
		bookArrayList.insertBook(insertIndex, newBook);
		
		bookArrayList.showAllBook();
		
		sc.close();
	}

}
