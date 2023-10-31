class Circle {
    protected int radius; // ������ ���� radius�� ����

    public Circle(int r) { // Circle Ŭ������ ������, ������ �Ű����� r�� ����
        radius = r; // �ν��Ͻ� ���� radius�� �������� �Ű����� r�� �ʱ�ȭ
    }
}

public class Pizza extends Circle {
    private String topping; // ���ڿ� ���� topping�� ����

    public Pizza(String topping, int r) { // Pizza Ŭ������ ������, ���ڿ��� ������ �Ű������� ����
        super(r); // �θ� Ŭ������ Circle�� ������ ȣ���ϸ�, �������� �ʱ�ȭ
        this.topping = topping; // �ν��Ͻ� ���� topping�� �������� �Ű����� topping���� �ʱ�ȭ
    }

    public void print() { // print �޼��� ����
        System.out.println(topping + " Pizza" + ", " + radius + " radius"); // ���ΰ� ������ ������ ���
    }

    public static void main(String args[]) { // ���α׷� ������
        Pizza obj = new Pizza("Pepperoni", 20); // Pizza Ŭ������ �ν��Ͻ� obj�� �����ϰ� �ʱ�ȭ
        obj.print(); // Pizza ��ü�� print �޼��带 ȣ���Ͽ� ���� ���
    }
}
