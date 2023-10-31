class Circle {
    protected int radius; // 정수형 변수 radius를 선언

    public Circle(int r) { // Circle 클래스의 생성자, 정수형 매개변수 r를 받음
        radius = r; // 인스턴스 변수 radius를 생성자의 매개변수 r로 초기화
    }
}

public class Pizza extends Circle {
    private String topping; // 문자열 변수 topping을 선언

    public Pizza(String topping, int r) { // Pizza 클래스의 생성자, 문자열과 정수형 매개변수를 받음
        super(r); // 부모 클래스인 Circle의 생성자 호출하며, 반지름을 초기화
        this.topping = topping; // 인스턴스 변수 topping을 생성자의 매개변수 topping으로 초기화
    }

    public void print() { // print 메서드 정의
        System.out.println(topping + " Pizza" + ", " + radius + " radius"); // 토핑과 반지름 정보를 출력
    }

    public static void main(String args[]) { // 프로그램 진입점
        Pizza obj = new Pizza("Pepperoni", 20); // Pizza 클래스의 인스턴스 obj를 생성하고 초기화
        obj.print(); // Pizza 객체의 print 메서드를 호출하여 정보 출력
    }
}
