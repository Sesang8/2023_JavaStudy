import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInform {
    public static void main(String[] args) {
        int num2 = 0;
        String num, name, tel, email;

        Scanner s = new Scanner(System.in);
        PrintWriter in = null;

        try {
            in = new PrintWriter(new FileWriter("user.txt"));

            while (true) {
                System.out.print("��ȣ: ");
                num = s.next();
                System.out.print("�̸�: ");
                name = s.next();
                System.out.print("��ȭ��ȣ: ");
                tel = s.next();
                System.out.print("�̸���: ");
                email = s.next();
                in.print(num + "," + name + "," + tel + "," + email + "\n");
                in.flush();

                System.out.print("�Է��� �������� 1, ����Ϸ��� 0: ");
                num2 = s.nextInt();
                if (num2 == 1)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
