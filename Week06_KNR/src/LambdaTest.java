import java.util.Arrays; // Arrays 클래스를 사용하기 위한 import 문
import java.util.List; // List 인터페이스를 사용하기 위한 import 문

// 배열을 처리하는 함수형 인터페이스 ArrayProcessing 정의
interface ArrayProcessing {
    double apply(double[] array); // 배열을 처리하는 메서드를 정의
}

// LambdaTest 클래스 정의
public class LambdaTest {

    // 최대값을 계산하는 람다 표현식
    public static final ArrayProcessing maxer = array -> {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    };

    // 최소값을 계산하는 람다 표현식
    public static final ArrayProcessing miner = array -> {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    };

    // 평균값을 계산하는 람다 표현식
    public static final ArrayProcessing sumer = array -> {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    };

    public static void main(String[] args) {
        double[] numbers = {1.0, 1.5, 2.0, 2.5, 3.0}; // 입력 배열 정의
        double maxValue = maxer.apply(numbers); // 최대값 계산
        double minValue = miner.apply(numbers); // 최소값 계산
        double averageValue = sumer.apply(numbers); // 평균값 계산

        // 결과 출력
        System.out.println("최대값: " + maxValue);
        System.out.println("최소값: " + minValue);
        System.out.println("평균값: " + averageValue);
    }
}
