import java.util.Arrays; // Arrays Ŭ������ ����ϱ� ���� import ��
import java.util.List; // List �������̽��� ����ϱ� ���� import ��
import java.util.stream.Collectors; // Collectors Ŭ������ ����ϱ� ���� import ��

// ���� Ÿ���� ��Ÿ���� ������ Type ����
enum Type {
    MEAT, FISH, OTHER
}

// ���� ������ �����ϴ� Food Ŭ����
public class Test {
    public static void main(String[] args) {
        // ���� �����͸� �����Ͽ� ����Ʈ�� ����
        List<Food> foodList = Arrays.asList(
            new Food("Salad", true, 100, Type.OTHER),
            new Food("Steak", false, 400, Type.MEAT),
            new Food("Salmon", false, 250, Type.FISH),
            new Food("Apple", true, 50, Type.OTHER),
            new Food("Chicken", false, 300, Type.MEAT)
        );

        // Stream API�� ����Ͽ� ���� �����͸� ���͸��ϰ� ����
        List<String> selectedFoods = foodList.stream()
                .filter(food -> food.getCalories() <= 300 && food.isVege())
                .map(Food::getName) // Food ��ü�� ���� �̸�(String)���� ����
                .collect(Collectors.toList()); // ����� ���� �̸��� ����Ʈ�� ����

        // ��� ���
        System.out.println("Į�θ��� 300 �����̰� ä�Ŀ� ���ϴ� ����: " + selectedFoods);
    }
}
