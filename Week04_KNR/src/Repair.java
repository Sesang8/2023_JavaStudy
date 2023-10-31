import java.awt.event.ItemEvent; // ItemEvent�� ����ϱ� ���� import ��
import java.awt.event.ItemListener; // ItemListener�� ����ϱ� ���� import ��
import javax.swing.Box; // Box Ŭ������ ����ϱ� ���� import ��
import javax.swing.BoxLayout; // BoxLayout�� ����ϱ� ���� import ��
import javax.swing.JCheckBox; // JCheckBox�� ����ϱ� ���� import ��
import javax.swing.JFrame; // JFrame�� ����ϱ� ���� import ��
import javax.swing.JLabel; // JLabel�� ����ϱ� ���� import ��
import javax.swing.JPanel; // JPanel�� ����ϱ� ���� import ��
import javax.swing.SwingUtilities; // SwingUtilities�� ����ϱ� ���� import ��

// Repair Ŭ���� ����
public class Repair extends JPanel implements ItemListener {
    JCheckBox buttons[] = new JCheckBox[4]; // JCheckBox �迭 ����
    String items[] = {"���� ���� ��ȯ", "�ڵ� ���ӱ� ���� ��ȯ", "������ ���� ��ȯ", "Ÿ�̾� ��ȯ"}; // ���� �׸� �迭
    int prices[] = {45000, 80000, 30000, 100000}; // �� �׸��� ���� �迭
    int money = 0; // ���� �׸��� ������ ����� �� ������ �����ϴ� ����
    JLabel label; // ����� ǥ���� ���̺�

    // Repair Ŭ���� ������
    public Repair() {
        super(); // �θ� Ŭ������ ������ ȣ��

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // ���̾ƿ� �Ŵ��� ���� (���� �ڽ� ���̾ƿ�)

        JPanel checkBoxPanel = new JPanel(); // üũ�ڽ��� ���� �г� ����
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JCheckBox(items[i]); // JCheckBox ���� �� �׸�� ����
            buttons[i].addItemListener(this); // �� üũ�ڽ��� ItemListener ����
            checkBoxPanel.add(buttons[i]); // �гο� üũ�ڽ� �߰�
        }
        add(checkBoxPanel); // ��ü �гο� üũ�ڽ� �г� �߰�

        add(Box.createVerticalGlue()); // ���� ��� ������ ���� �� ���� �߰�

        label = new JLabel("������ ������ " + money + "���Դϴ�"); // ����� ǥ���� ���̺� ����
        label.setAlignmentX(CENTER_ALIGNMENT); // ���̺��� ��� ����
        add(label); // ��ü �гο� ��� ���̺� �߰�
    }

    // üũ�ڽ� ���°� ����� �� ȣ��Ǵ� �޼���
    @Override
    public void itemStateChanged(ItemEvent e) {
        money = 0; // �� ���� �ʱ�ȭ
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                money += prices[i]; // ���õ� �׸��� ������ �� ���ݿ� �߰�
            }
        }

        label.setText("������ ������ " + money + "���Դϴ�"); // ��� ���̺� ������Ʈ
    }

    // ���� �޼���
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Car Repair"); // JFrame ����
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ���� �� ���α׷� ���� ����
            frame.add(new Repair()); // Repair �г��� �����ӿ� �߰�
            frame.pack(); // ������ ũ�� ����
            frame.setVisible(true); // �������� ȭ�鿡 ǥ��
        });
    }
}
