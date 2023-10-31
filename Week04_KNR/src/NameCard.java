import java.awt.BorderLayout; // BorderLayout�� ����ϱ� ���� import ��
import java.awt.Image; // Image�� ����ϱ� ���� import ��
import javax.swing.ImageIcon; // ImageIcon�� ����ϱ� ���� import ��
import javax.swing.JFrame; // JFrame�� ����ϱ� ���� import ��
import javax.swing.JLabel; // JLabel�� ����ϱ� ���� import ��
import javax.swing.JPanel; // JPanel�� ����ϱ� ���� import ��
import javax.swing.JTextField; // JTextField�� ����ϱ� ���� import ��
import javax.swing.SwingUtilities; // SwingUtilities�� ����ϱ� ���� import ��

public class NameCard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BusinessCard"); // JFrame ���� �� ���� ����
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� �� ���α׷� ���� ����
            frame.setSize(250, 160); // �������� ũ�� ����

            JPanel panel = new JPanel(); // �г� ����
            panel.setLayout(null); // �г��� ���̾ƿ� �Ŵ����� ���� ��ġ�� ����

            ImageIcon imageIcon = new ImageIcon("cat.png"); // �̹��� ������ �ε��� ImageIcon ����

            Image image = imageIcon.getImage(); // �̹��� �����ܿ��� �̹��� ��ü ����
            Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // �̹��� ũ�� ����
            ImageIcon scaledIcon = new ImageIcon(scaledImage); // ũ�� ������ �̹����� ���ο� ImageIcon ����

            JLabel imageLabel = new JLabel(scaledIcon); // ũ�� ������ �̹����� ǥ���� ���̺� ����
            imageLabel.setBounds(10, 10, 100, 100); // ���̺��� ��ġ�� ũ�� ����
            panel.add(imageLabel); // �гο� �̹��� ���̺� �߰�

            JPanel textPanel = new JPanel(); // �ؽ�Ʈ ������ ���� �г� ����
            textPanel.setLayout(null); // �г��� ���̾ƿ� �Ŵ����� ���� ��ġ�� ����

            // �̸��� ��Ÿ���� ���̺� ���� �� ����
            JLabel lblNewLabel = new JLabel("�����");
            lblNewLabel.setBounds(60, 20, 80, 15); // ���̺��� ��ġ�� ũ�� ����
            textPanel.add(lblNewLabel); // �ؽ�Ʈ �гο� �̸� ���̺� �߰�

            // ������ ��Ÿ���� ���̺� ���� �� ����
            JLabel lblNewLabel_1 = new JLabel("Ȩ��������");
            lblNewLabel_1.setBounds(60, 40, 80, 15); // ���̺��� ��ġ�� ũ�� ����
            textPanel.add(lblNewLabel_1); // �ؽ�Ʈ �гο� ���� ���̺� �߰�

            // ȸ�� ������ ��Ÿ���� ���̺� ���� �� ����
            JLabel lblNewLabel_2 = new JLabel("īī�� �ֽ�ȸ��");
            lblNewLabel_2.setBounds(60, 60, 100, 15); // ���̺��� ��ġ�� ũ�� ����
            textPanel.add(lblNewLabel_2); // �ؽ�Ʈ �гο� ȸ�� ���� ���̺� �߰�

            textPanel.setBounds(60, 10, 160, 120); // �ؽ�Ʈ �г��� ��ġ�� ũ�� ����
            panel.add(textPanel); // �гο� �ؽ�Ʈ �г� �߰�

            frame.add(panel); // �����ӿ� �г� �߰�
            frame.setVisible(true); // �������� ȭ�鿡 ǥ��
        });
    }
}
