import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MileToKilometer {
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Mile -> Km");

        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel milesLabel = new JLabel("마일을 입력하시오:");
        JTextField milesField = new JTextField(10);
        JLabel arrow = new JLabel("->");
        JTextField kmField = new JTextField(10);
        JButton convertButton = new JButton("변환");

        panel.add(milesLabel);
        panel.add(milesField);
        panel.add(arrow);
        panel.add(kmField);
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double miles = Double.parseDouble(milesField.getText());
                double kilometers = miles * 1.609344; 
                kmField.setText(String.format("%f", kilometers));
            }
        });

        frame.pack();
        
        frame.setVisible(true);
    }
}
