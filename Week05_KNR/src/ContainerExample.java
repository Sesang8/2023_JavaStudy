class Container<T> { // ���׸� ���
	private T data; // private�� �����Ͽ� ���� ����
	public void set(T data) { this.data = data; } // ������... �޼ҵ� �� ����
	public T get() { return data; } // ������... �޼ҵ� �� ������
	
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("ȫ�浿"); // String Ÿ������ �޼ҵ� �� ����
		String str = container1.get(); // �޼ҵ� �� ������
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6); //integer Ÿ������ �޼ҵ� �� ����
		int value = container2.get(); // �޼ҵ� �� ������
		System.out.println(value);

	}

}
