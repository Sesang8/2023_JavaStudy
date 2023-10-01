import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class NameCard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BusinessCard");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(250, 160);

            JPanel panel = new JPanel();
            panel.setLayout(null); 

            ImageIcon imageIcon = new ImageIcon("cat.png"); 

            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(10, 10, 100, 100); 
            panel.add(imageLabel);

            JPanel textPanel = new JPanel();
            textPanel.setLayout(null);

            JLabel lblNewLabel = new JLabel("김춘식");
            lblNewLabel.setBounds(60, 20, 80, 15);
            textPanel.add(lblNewLabel);
            
            JLabel lblNewLabel_1 = new JLabel("홈프로텍터");
            lblNewLabel_1.setBounds(60, 40, 80, 15); 
            textPanel.add(lblNewLabel_1);
            
            JLabel lblNewLabel_2 = new JLabel("카카오 주식회사");
            lblNewLabel_2.setBounds(60, 60, 100, 15);
            textPanel.add(lblNewLabel_2);

            textPanel.setBounds(60, 10, 160, 120); 
            panel.add(textPanel);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
