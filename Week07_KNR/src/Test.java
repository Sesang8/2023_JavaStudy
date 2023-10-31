import java.io.BufferedReader; // BufferedReader Ŭ������ ����ϱ� ���� import ��
import java.io.File; // File Ŭ������ ����ϱ� ���� import ��
import java.io.FileReader; // FileReader Ŭ������ ����ϱ� ���� import ��
import java.io.FileWriter; // FileWriter Ŭ������ ����ϱ� ���� import ��
import java.io.PrintWriter; // PrintWriter Ŭ������ ����ϱ� ���� import ��
import java.io.IOException; // IOException ���ܸ� ó���ϱ� ���� import ��

public class Test {
    public static void main(String[] args) {
        // �Է� ���ϰ� ��� ������ ����
        File file1 = new File("obama.txt"); // �Է� ����
        File file2 = new File("output.txt"); // ��� ����

        try (BufferedReader in = new BufferedReader(new FileReader(file1));
             PrintWriter out = new PrintWriter(new FileWriter(file2))) {
            // try-with-resources ����� ����Ͽ� ���� ������� �����ϰ� ó��

            int ch;
            while ((ch = in.read()) != -1) {
                if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch); // �ҹ��ڸ� �빮�ڷ� ��ȯ
                }
                out.print((char) ch); // ��ȯ�� ���ڸ� ��� ���Ͽ� ����
            }
        } catch (IOException e) {
            e.printStackTrace(); // IOException�� �߻��ϸ� ���� ���� ���
        }
    }
}
