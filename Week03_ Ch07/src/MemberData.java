import javax.swing.*;
import java.awt.*;

public class MemberData extends JFrame {
    public MemberData() {
        setTitle("ȸ�� ����ϱ�");
        setSize(400, 200); // ũ�� ����

        JPanel panel = new JPanel(new GridLayout(5, 2)); // 5�� 2���� GridLayout ���
        add(panel);

        panel.add(new JLabel("�̸�"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("�н�����"));
        panel.add(new JPasswordField(20));
        panel.add(new JLabel("�̸��� �ּ�"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("��ȭ��ȣ"));
        panel.add(new JTextField(20));

        JButton button1 = new JButton("����ϱ�");
        panel.add(button1);

        JButton button2 = new JButton("���");
        panel.add(button2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemberData();
            }
        });
    }
}
