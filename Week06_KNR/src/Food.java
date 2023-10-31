public class Food {
    // 음식의 이름, 채식 유무, 칼로리, 타입을 저장하는 멤버 변수들
    String name; // 음식의 이름
    boolean Vege; // 채식 유무를 나타내는 불린 값
    int calories; // 음식의 칼로리
    Type type; // 음식의 타입을 저장하는 열거형 타입(Type)

    // Food 클래스의 생성자, 음식의 정보를 초기화
    public Food(String name, boolean vegetarian, int calories, Type type) {
        this.name = name; // 이름 초기화
        this.Vege = vegetarian; // 채식 유무 초기화
        this.calories = calories; // 칼로리 초기화
        this.type = type; // 타입 초기화
    }

    // 이름을 반환하는 메서드
    public String getName() {
        return name;
    }
    
    // 채식 유무를 반환하는 메서드
    public boolean isVege() {
        return Vege;
    }
    
    // 채식 유무를 설정하는 메서드
    public void setVege(boolean vege) {
        Vege = vege;
    }

    // 칼로리를 반환하는 메서드
    public int getCalories() {
        return calories;
    }

    // 음식의 타입(Type)을 반환하는 메서드
    public Type getType() {
        return type;
    }

    // toString() 메서드를 오버라이드하여 음식의 이름을 반환
    @Override
    public String toString() {
        return name;
    }
}
