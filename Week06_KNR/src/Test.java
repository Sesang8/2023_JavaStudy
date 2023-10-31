import java.util.Arrays; // Arrays 클래스를 사용하기 위한 import 문
import java.util.List; // List 인터페이스를 사용하기 위한 import 문
import java.util.stream.Collectors; // Collectors 클래스를 사용하기 위한 import 문

// 음식 타입을 나타내는 열거형 Type 정의
enum Type {
    MEAT, FISH, OTHER
}

// 음식 정보를 저장하는 Food 클래스
public class Test {
    public static void main(String[] args) {
        // 음식 데이터를 생성하여 리스트로 저장
        List<Food> foodList = Arrays.asList(
            new Food("Salad", true, 100, Type.OTHER),
            new Food("Steak", false, 400, Type.MEAT),
            new Food("Salmon", false, 250, Type.FISH),
            new Food("Apple", true, 50, Type.OTHER),
            new Food("Chicken", false, 300, Type.MEAT)
        );

        // Stream API를 사용하여 음식 데이터를 필터링하고 추출
        List<String> selectedFoods = foodList.stream()
                .filter(food -> food.getCalories() <= 300 && food.isVege())
                .map(Food::getName) // Food 객체를 음식 이름(String)으로 매핑
                .collect(Collectors.toList()); // 추출된 음식 이름을 리스트로 수집

        // 결과 출력
        System.out.println("칼로리가 300 이하이고 채식에 속하는 음식: " + selectedFoods);
    }
}
