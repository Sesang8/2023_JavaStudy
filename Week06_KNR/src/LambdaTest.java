import java.util.Arrays; // Arrays Ŭ������ ����ϱ� ���� import ��
import java.util.List; // List �������̽��� ����ϱ� ���� import ��

// �迭�� ó���ϴ� �Լ��� �������̽� ArrayProcessing ����
interface ArrayProcessing {
    double apply(double[] array); // �迭�� ó���ϴ� �޼��带 ����
}

// LambdaTest Ŭ���� ����
public class LambdaTest {

    // �ִ밪�� ����ϴ� ���� ǥ����
    public static final ArrayProcessing maxer = array -> {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    };

    // �ּҰ��� ����ϴ� ���� ǥ����
    public static final ArrayProcessing miner = array -> {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    };

    // ��հ��� ����ϴ� ���� ǥ����
    public static final ArrayProcessing sumer = array -> {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    };

    public static void main(String[] args) {
        double[] numbers = {1.0, 1.5, 2.0, 2.5, 3.0}; // �Է� �迭 ����
        double maxValue = maxer.apply(numbers); // �ִ밪 ���
        double minValue = miner.apply(numbers); // �ּҰ� ���
        double averageValue = sumer.apply(numbers); // ��հ� ���

        // ��� ���
        System.out.println("�ִ밪: " + maxValue);
        System.out.println("�ּҰ�: " + minValue);
        System.out.println("��հ�: " + averageValue);
    }
}
