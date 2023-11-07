import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDownTest extends JFrame {
    private JLabel label;
    private Thread t;

    class Counter extends Thread {
        public void run() {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
                label.setText(i + "");
            }
        }
    }

    public CountDownTest() {
        setTitle("카운트다운");
        setSize(400, 150);
        getContentPane().setLayout(null);

        label = new JLabel("0");
        label.setBounds(10, 0, 384, 111);
        label.setFont(new Font("Serif", Font.BOLD, 100));
        getContentPane().add(label);

        JButton startButton = new JButton("카운트 시작");
        startButton.setBounds(200, 25, 125, 23);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t == null || !t.isAlive()) {
                    t = new Counter();
                    t.start();
                }
            }
        });
        getContentPane().add(startButton);

        JButton stopButton = new JButton("카운트 중지");
        stopButton.setBounds(200, 50, 125, 23);
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t != null && t.isAlive()) {
                    t.interrupt();
                }
            }
        });
        getContentPane().add(stopButton);
    }

    public static void main(String[] args) {
        CountDownTest t = new CountDownTest();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}
