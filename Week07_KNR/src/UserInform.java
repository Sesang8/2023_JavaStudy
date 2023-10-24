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
                System.out.print("번호: ");
                num = s.next();
                System.out.print("이름: ");
                name = s.next();
                System.out.print("전화번호: ");
                tel = s.next();
                System.out.print("이메일: ");
                email = s.next();
                in.print(num + "," + name + "," + tel + "," + email + "\n");
                in.flush();

                System.out.print("입력을 끝냈으면 1, 계속하려면 0: ");
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
