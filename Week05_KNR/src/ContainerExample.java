class Container<T> { // 제네릭 사용
	private T data; // private로 선언하여 정보 은닉
	public void set(T data) { this.data = data; } // 설정자... 메소드 값 설정
	public T get() { return data; } // 접근자... 메소드 값 가져옴
	
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동"); // String 타입으로 메소드 값 설정
		String str = container1.get(); // 메소드 값 가져옴
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6); //integer 타입으로 메소드 값 설정
		int value = container2.get(); // 메소드 값 가져옴
		System.out.println(value);

	}

}
