import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Type {
    MEAT, FISH, OTHER
}

public class Test {
    public static void main(String[] args) {
        // ���� �����͸� ����
        List<Food> foodList = Arrays.asList(
            new Food("Salad", true, 100, Type.OTHER),
            new Food("Steak", false, 400, Type.MEAT),
            new Food("Salmon", false, 250, Type.FISH),
            new Food("Apple", true, 50, Type.OTHER),
            new Food("Chicken", false, 300, Type.MEAT)
        );

        // Į�θ��� 300 �����̰� ä�Ŀ� ���ϴ� ������ �̸��� ������ ����Ʈ�� ����
        List<String> selectedFoods = foodList.stream()
                .filter(food -> food.getCalories() <= 300 && food.isVege())
                .map(Food::getName)
                .collect(Collectors.toList());

        System.out.println("Į�θ��� 300 �����̰� ä�Ŀ� ���ϴ� ����: " + selectedFoods);
    }
}
