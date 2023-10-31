class Container<T> { // 제네릭 클래스 정의, T는 타입 파라미터
    private T data; // private로 선언된 멤버 변수, 정보 은닉을 위해

    public void set(T data) { // 설정자 메서드, 값을 설정하는 메서드
        this.data = data; // 멤버 변수에 값을 설정
    }

    public T get() { // 접근자 메서드, 값을 가져오는 메서드
        return data; // 멤버 변수의 값을 반환
    }
}

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>(); // Container 객체 생성, 제네릭 타입으로 String을 사용
        container1.set("홍길동"); // container1 객체의 set 메서드로 String 값을 설정
        String str = container1.get(); // container1 객체의 get 메서드로 String 값을 가져옴
        System.out.println(str); // 가져온 String 값을 출력

        Container<Integer> container2 = new Container<Integer>(); // Container 객체 생성, 제네릭 타입으로 Integer를 사용
        container2.set(6); // container2 객체의 set 메서드로 Integer 값을 설정
        int value = container2.get(); // container2 객체의 get 메서드로 Integer 값을 가져옴
        System.out.println(value); // 가져온 Integer 값을 출력
    }
}
