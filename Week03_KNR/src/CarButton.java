import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarButton extends JFrame {
    private JLabel carLabel;
    private int carX = 50; 

    public CarButton() {
        setTitle("자동차 이동");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        ImageIcon carIcon = new ImageIcon("car.png");
        carLabel = new JLabel(carIcon);
        carLabel.setHorizontalAlignment(JLabel.CENTER); 
        add(carLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(buttonPanel, BorderLayout.SOUTH);

        JButton leftButton = new JButton("Left");
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carX -= 10;
                carLabel.setLocation(carX, carLabel.getY());
            }
        });
        buttonPanel.add(leftButton);

        JButton rightButton = new JButton("Right");
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carX += 10;
                carLabel.setLocation(carX, carLabel.getY());
            }
        });
        buttonPanel.add(rightButton);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CarButton();
            }
        });
    }
}
