import java.io.BufferedReader; // BufferedReader 클래스를 사용하기 위한 import 문
import java.io.File; // File 클래스를 사용하기 위한 import 문
import java.io.FileReader; // FileReader 클래스를 사용하기 위한 import 문
import java.io.FileWriter; // FileWriter 클래스를 사용하기 위한 import 문
import java.io.PrintWriter; // PrintWriter 클래스를 사용하기 위한 import 문
import java.io.IOException; // IOException 예외를 처리하기 위한 import 문

public class Test {
    public static void main(String[] args) {
        // 입력 파일과 출력 파일을 생성
        File file1 = new File("obama.txt"); // 입력 파일
        File file2 = new File("output.txt"); // 출력 파일

        try (BufferedReader in = new BufferedReader(new FileReader(file1));
             PrintWriter out = new PrintWriter(new FileWriter(file2))) {
            // try-with-resources 블록을 사용하여 파일 입출력을 안전하게 처리

            int ch;
            while ((ch = in.read()) != -1) {
                if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch); // 소문자를 대문자로 변환
                }
                out.print((char) ch); // 변환된 문자를 출력 파일에 쓰기
            }
        } catch (IOException e) {
            e.printStackTrace(); // IOException이 발생하면 예외 정보 출력
        }
    }
}
