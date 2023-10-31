class Container<T> { // ���׸� Ŭ���� ����, T�� Ÿ�� �Ķ����
    private T data; // private�� ����� ��� ����, ���� ������ ����

    public void set(T data) { // ������ �޼���, ���� �����ϴ� �޼���
        this.data = data; // ��� ������ ���� ����
    }

    public T get() { // ������ �޼���, ���� �������� �޼���
        return data; // ��� ������ ���� ��ȯ
    }
}

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>(); // Container ��ü ����, ���׸� Ÿ������ String�� ���
        container1.set("ȫ�浿"); // container1 ��ü�� set �޼���� String ���� ����
        String str = container1.get(); // container1 ��ü�� get �޼���� String ���� ������
        System.out.println(str); // ������ String ���� ���

        Container<Integer> container2 = new Container<Integer>(); // Container ��ü ����, ���׸� Ÿ������ Integer�� ���
        container2.set(6); // container2 ��ü�� set �޼���� Integer ���� ����
        int value = container2.get(); // container2 ��ü�� get �޼���� Integer ���� ������
        System.out.println(value); // ������ Integer ���� ���
    }
}
