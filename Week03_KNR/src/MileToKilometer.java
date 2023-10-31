import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MileToKilometer {
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Mile -> Km");
    	
    	JPanel panel = new JPanel();
    	frame.add(panel);
    	
    	JLabel mLabel = new JLabel("마일을 입력하시오:");
    	JTextField mField = new JTextField(10);
    	JLabel arrow = new JLabel("->");
    	JTextField kmField = new JTextField(10);
    	JButton Button = new JButton("변환");
    	
    	panel.add(mLabel);
    	panel.add(mField);
    	panel.add(arrow);
    	panel.add(kmField);
    	panel.add(Button);
    	
    	Button.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			double miles = Double.parseDouble(mField.getText());
    			double kilometers = miles * 1.609344;
    			kmField.setText(String.format("%f km",  kilometers));
    		}
    	});
    	
    	frame.pack();
    	frame.setVisible(true);
    	
    }
}
