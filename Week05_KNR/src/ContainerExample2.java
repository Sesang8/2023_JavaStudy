class Container2<K, Y> { // 제네릭 클래스 정의, K와 Y는 타입 파라미터
    private K object; // K 타입의 멤버 변수
    private Y object2; // Y 타입의 멤버 변수

    public void set(K object, Y object2) { // 설정자 메서드
        this.object = object; // 멤버 변수에 K 타입의 값을 설정
        this.object2 = object2; // 멤버 변수에 Y 타입의 값을 설정
    }

    // Key 값을 반환하는 접근자 메서드
    public K getKey() {
        return object;
    }

    // Value 값을 반환하는 접근자 메서드
    public Y getValue() {
        return object2;
    }
}

public class ContainerExample2 {
    public static void main(String[] args) {
        // Container2 객체 생성, K와 Y 타입 모두 String
        Container2<String, String> container1 = new Container2<String, String>();
        container1.set("홍길동", "도적"); // Key와 Value 값을 설정
        String name1 = container1.getKey(); // Key 값을 가져옴
        String job = container1.getValue(); // Value 값을 가져옴
        System.out.println(name1 + ", " + job); // 가져온 값을 출력

        // Container2 객체 생성, K는 String, Y는 Integer
        Container2<String, Integer> container2 = new Container2<String, Integer>();
        container2.set("홍길동", 35); // Key와 Value 값을 설정
        String name2 = container2.getKey(); // Key 값을 가져옴
        int age = container2.getValue(); // Value 값을 가져옴
        System.out.println(name2 + ", " + age); // 가져온 값을 출력
    }
}
