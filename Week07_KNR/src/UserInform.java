import java.io.FileWriter; // FileWriter Ŭ������ ����ϱ� ���� import ��
import java.io.PrintWriter; // PrintWriter Ŭ������ ����ϱ� ���� import ��
import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ���� import ��

public class UserInform {
    public static void main(String[] args) {
        int num2 = 0;
        String num, name, tel, email;

        Scanner s = new Scanner(System.in); // ����� �Է��� �ޱ� ���� Scanner ��ü ����
        PrintWriter in = null; // ���� ���⸦ ���� PrintWriter ��ü �ʱ�ȭ

        try {
            in = new PrintWriter(new FileWriter("user.txt")); // "user.txt" ���Ͽ� ���� ���� PrintWriter ��ü ����

            while (true) {
                System.out.print("��ȣ: ");
                num = s.next(); // ����ڷκ��� ��ȣ �Է�
                System.out.print("�̸�: ");
                name = s.next(); // ����ڷκ��� �̸� �Է�
                System.out.print("��ȭ��ȣ: ");
                tel = s.next(); // ����ڷκ��� ��ȭ��ȣ �Է�
                System.out.print("�̸���: ");
                email = s.next(); // ����ڷκ��� �̸��� �Է�

                in.print(num + "," + name + "," + tel + "," + email + "\n"); // ������ ���Ͽ� ����
                in.flush(); // ���� ����

                System.out.print("�Է��� �������� 1, ����Ϸ��� 0: ");
                num2 = s.nextInt(); // ����ڷκ��� ��� ���� �Է�
                if (num2 == 1)
                    break; // 1�� �Է��ϸ� �Է� ����
            }
        } catch (Exception e) {
            e.printStackTrace(); // ���ܰ� �߻��ϸ� ���� ���� ���
        } finally {
            if (in != null) {
                in.close(); // PrintWriter�� ����
            }
        }
    }
}
