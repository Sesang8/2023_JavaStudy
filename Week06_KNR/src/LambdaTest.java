import java.util.Arrays;
import java.util.List;

interface ArrayProcessing {
    double apply(double[] array);
}

public class LambdaTest {

    public static final ArrayProcessing maxer = array -> {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    };

    public static final ArrayProcessing miner = array -> {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    };

    public static final ArrayProcessing sumer = array -> {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    };

    public static void main(String[] args) {
        double[] numbers = {1.0, 1.5, 2.0, 2.5, 3.0};
        double maxValue = maxer.apply(numbers);
        double minValue = miner.apply(numbers);
        double averageValue = sumer.apply(numbers);

        System.out.println("최대값: " + maxValue);
        System.out.println("최소값: " + minValue);
        System.out.println("평균값: " + averageValue);
    }
}
