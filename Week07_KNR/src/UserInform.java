import java.io.FileWriter; // FileWriter 클래스를 사용하기 위한 import 문
import java.io.PrintWriter; // PrintWriter 클래스를 사용하기 위한 import 문
import java.util.Scanner; // Scanner 클래스를 사용하기 위한 import 문

public class UserInform {
    public static void main(String[] args) {
        int num2 = 0;
        String num, name, tel, email;

        Scanner s = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        PrintWriter in = null; // 파일 쓰기를 위한 PrintWriter 객체 초기화

        try {
            in = new PrintWriter(new FileWriter("user.txt")); // "user.txt" 파일에 쓰기 위한 PrintWriter 객체 생성

            while (true) {
                System.out.print("번호: ");
                num = s.next(); // 사용자로부터 번호 입력
                System.out.print("이름: ");
                name = s.next(); // 사용자로부터 이름 입력
                System.out.print("전화번호: ");
                tel = s.next(); // 사용자로부터 전화번호 입력
                System.out.print("이메일: ");
                email = s.next(); // 사용자로부터 이메일 입력

                in.print(num + "," + name + "," + tel + "," + email + "\n"); // 정보를 파일에 쓰기
                in.flush(); // 버퍼 비우기

                System.out.print("입력을 끝냈으면 1, 계속하려면 0: ");
                num2 = s.nextInt(); // 사용자로부터 계속 여부 입력
                if (num2 == 1)
                    break; // 1을 입력하면 입력 종료
            }
        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생하면 예외 정보 출력
        } finally {
            if (in != null) {
                in.close(); // PrintWriter를 닫음
            }
        }
    }
}
