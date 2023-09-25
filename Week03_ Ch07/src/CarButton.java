import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarButton extends JFrame {
    private JLabel carLabel;
    private int carX = 50; // �ڵ����� �ʱ� X ��ġ

    public CarButton() {
        setTitle("�ڵ��� �̵�");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);

        // �ڵ��� ������ JLabel�� �߰�
        ImageIcon carIcon = new ImageIcon("car.png");
        carLabel = new JLabel(carIcon);
        panel.add(carLabel);

        // Left ��ư
        JButton leftButton = new JButton("Left");
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveCarLeft();
            }
        });
        panel.add(leftButton);

        // Right ��ư
        JButton rightButton = new JButton("Right");
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveCarRight();
            }
        });
        panel.add(rightButton);

        setVisible(true);
    }

    // �ڵ����� �������� �̵�
    private void moveCarLeft() {
        carX -= 10;
        carLabel.setLocation(carX, carLabel.getY());
    }

    // �ڵ����� ���������� �̵�
    private void moveCarRight() {
        carX += 10;
        carLabel.setLocation(carX, carLabel.getY());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CarButton();
            }
        });
    }
}
