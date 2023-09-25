import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarButton extends JFrame {
    private JLabel carLabel;
    private int carX = 50; // 자동차의 초기 X 위치

    public CarButton() {
        setTitle("자동차 이동");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);

        // 자동차 사진을 JLabel에 추가
        ImageIcon carIcon = new ImageIcon("car.png");
        carLabel = new JLabel(carIcon);
        panel.add(carLabel);

        // Left 버튼
        JButton leftButton = new JButton("Left");
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveCarLeft();
            }
        });
        panel.add(leftButton);

        // Right 버튼
        JButton rightButton = new JButton("Right");
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveCarRight();
            }
        });
        panel.add(rightButton);

        setVisible(true);
    }

    // 자동차를 왼쪽으로 이동
    private void moveCarLeft() {
        carX -= 10;
        carLabel.setLocation(carX, carLabel.getY());
    }

    // 자동차를 오른쪽으로 이동
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
