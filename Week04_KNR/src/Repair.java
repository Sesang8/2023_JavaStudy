import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Repair extends JPanel implements ItemListener {
    JCheckBox buttons[] = new JCheckBox[4];
    String items[] = {"엔진 오일 교환", "자동 변속기 오일 교환", "에어콘 필터 교환", "타이어 교환"};
    int prices[] = {45000, 80000, 30000, 100000};
    int money = 0;
    JLabel label;

    public Repair() {
        super();
   
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel checkBoxPanel = new JPanel();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JCheckBox(items[i]);
            buttons[i].addItemListener(this);
            checkBoxPanel.add(buttons[i]);
        }
        add(checkBoxPanel);

        add(Box.createVerticalGlue());

        label = new JLabel("현재의 가격은 " + money + "원입니다");
        label.setAlignmentX(CENTER_ALIGNMENT); 
        add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        money = 0;
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                money += prices[i];
            }
        }

        label.setText("현재의 가격은 " + money + "원입니다");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Car Repair");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Repair());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
