public class Food {
    // ������ �̸�, ä�� ����, Į�θ�, Ÿ���� �����ϴ� ��� ������
    String name; // ������ �̸�
    boolean Vege; // ä�� ������ ��Ÿ���� �Ҹ� ��
    int calories; // ������ Į�θ�
    Type type; // ������ Ÿ���� �����ϴ� ������ Ÿ��(Type)

    // Food Ŭ������ ������, ������ ������ �ʱ�ȭ
    public Food(String name, boolean vegetarian, int calories, Type type) {
        this.name = name; // �̸� �ʱ�ȭ
        this.Vege = vegetarian; // ä�� ���� �ʱ�ȭ
        this.calories = calories; // Į�θ� �ʱ�ȭ
        this.type = type; // Ÿ�� �ʱ�ȭ
    }

    // �̸��� ��ȯ�ϴ� �޼���
    public String getName() {
        return name;
    }
    
    // ä�� ������ ��ȯ�ϴ� �޼���
    public boolean isVege() {
        return Vege;
    }
    
    // ä�� ������ �����ϴ� �޼���
    public void setVege(boolean vege) {
        Vege = vege;
    }

    // Į�θ��� ��ȯ�ϴ� �޼���
    public int getCalories() {
        return calories;
    }

    // ������ Ÿ��(Type)�� ��ȯ�ϴ� �޼���
    public Type getType() {
        return type;
    }

    // toString() �޼��带 �������̵��Ͽ� ������ �̸��� ��ȯ
    @Override
    public String toString() {
        return name;
    }
}
