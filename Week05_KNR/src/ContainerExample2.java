class Container2<K, Y> { // ���׸� Ŭ���� ����, K�� Y�� Ÿ�� �Ķ����
    private K object; // K Ÿ���� ��� ����
    private Y object2; // Y Ÿ���� ��� ����

    public void set(K object, Y object2) { // ������ �޼���
        this.object = object; // ��� ������ K Ÿ���� ���� ����
        this.object2 = object2; // ��� ������ Y Ÿ���� ���� ����
    }

    // Key ���� ��ȯ�ϴ� ������ �޼���
    public K getKey() {
        return object;
    }

    // Value ���� ��ȯ�ϴ� ������ �޼���
    public Y getValue() {
        return object2;
    }
}

public class ContainerExample2 {
    public static void main(String[] args) {
        // Container2 ��ü ����, K�� Y Ÿ�� ��� String
        Container2<String, String> container1 = new Container2<String, String>();
        container1.set("ȫ�浿", "����"); // Key�� Value ���� ����
        String name1 = container1.getKey(); // Key ���� ������
        String job = container1.getValue(); // Value ���� ������
        System.out.println(name1 + ", " + job); // ������ ���� ���

        // Container2 ��ü ����, K�� String, Y�� Integer
        Container2<String, Integer> container2 = new Container2<String, Integer>();
        container2.set("ȫ�浿", 35); // Key�� Value ���� ����
        String name2 = container2.getKey(); // Key ���� ������
        int age = container2.getValue(); // Value ���� ������
        System.out.println(name2 + ", " + age); // ������ ���� ���
    }
}
