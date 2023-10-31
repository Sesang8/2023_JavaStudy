import java.util.Arrays; // Arrays Ŭ������ ����ϱ� ���� import ��
import java.util.List; // List �������̽��� ����ϱ� ���� import ��
import java.util.stream.Collectors; // ��Ʈ�� ������ ����ϱ� ���� import ��

// MethodReferenceLowerCase Ŭ���� ����
public class MethodReferenceLowerCase {
    public static void main(String[] args) {
        // ���ڿ� ����� �����ϰ� �ʱ�ȭ
        List<String> listOfNames = Arrays.asList(new String[]
                {"Apple", "Banana", "Cherry"});

        System.out.println(listOfNames); // �ʱ� ���ڿ� ��� ���

        // ��Ʈ���� ����Ͽ� ���ڿ��� �ҹ��ڷ� ��ȯ�ϰ� �����Ͽ� ���ο� ������� ����
        List<String> sublist = listOfNames.stream()
                .map(s -> Character.toLowerCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
        
        // ��ȯ ���� ��� ���
        System.out.println("��ȯ ��: " + sublist);
    }
}
