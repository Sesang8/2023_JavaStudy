import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Type {
    MEAT, FISH, OTHER
}

public class Test {
    public static void main(String[] args) {
        // 음식 데이터를 생성
        List<Food> foodList = Arrays.asList(
            new Food("Salad", true, 100, Type.OTHER),
            new Food("Steak", false, 400, Type.MEAT),
            new Food("Salmon", false, 250, Type.FISH),
            new Food("Apple", true, 50, Type.OTHER),
            new Food("Chicken", false, 300, Type.MEAT)
        );

        // 칼로리가 300 이하이고 채식에 속하는 음식의 이름을 추출해 리스트로 만듦
        List<String> selectedFoods = foodList.stream()
                .filter(food -> food.getCalories() <= 300 && food.isVege())
                .map(Food::getName)
                .collect(Collectors.toList());

        System.out.println("칼로리가 300 이하이고 채식에 속하는 음식: " + selectedFoods);
    }
}
