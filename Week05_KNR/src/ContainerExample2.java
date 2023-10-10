class Container2<K, Y> {
	private K object;
	private Y object2;
	
	public void set(K object, Y object2) { // 설정자 
		this.object = object;
		this.object2 = object2;
	}
	
	// 접근자
	public K getKey() {return object;} 
	public Y getValue() {return object2;}
}


public class ContainerExample2 {
	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + ", " + job);
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + ", " + age);

	}

}
