import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ī��Ʈ�ٿ��� �׽�Ʈ�ϴ� Ŭ���� ����
public class CountDownTest extends JFrame {
    private JLabel label;
    private Thread t;

    // ���� Ŭ������ Counter �����带 ��ӹ޾� ī��Ʈ�ٿ��� �����ϴ� Ŭ���� ����
    class Counter extends Thread {
        public void run() {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(1000); // 1�� ���� ������ �Ͻ� ����
                } catch (InterruptedException e) {
                    // InterruptedException�� �߻��ϸ� ������ ����
                    return;
                }
                label.setText(i + ""); // ���̺� ���� ī��Ʈ �� ǥ��
            }
        }
    }

    // ������: GUI �ʱ�ȭ �� �̺�Ʈ ó�� ����
    public CountDownTest() {
        setTitle("ī��Ʈ�ٿ�");
        setSize(400, 150);
        getContentPane().setLayout(null);

        label = new JLabel("0");
        label.setBounds(10, 0, 384, 111);
        label.setFont(new Font("Serif", Font.BOLD, 100));
        getContentPane().add(label);

        JButton startButton = new JButton("ī��Ʈ ����");
        startButton.setBounds(200, 25, 125, 23);
        
        // "ī��Ʈ ����" ��ư Ŭ�� �� ActionListener�� ���� �����带 �����ϵ��� ����
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t == null || !t.isAlive()) {
                    t = new Counter();
                    t.start();
                }
            }
        });
        getContentPane().add(startButton);

        JButton stopButton = new JButton("ī��Ʈ ����");
        stopButton.setBounds(200, 50, 125, 23);
        
        // "ī��Ʈ ����" ��ư Ŭ�� �� ActionListener�� ���� �����带 �����ϵ��� ����
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t != null && t.isAlive()) {
                    t.interrupt();
                }
            }
        });
        getContentPane().add(stopButton);
    }

    // main �޼���: CountDownTest ��ü�� �����Ͽ� ī��Ʈ�ٿ� �׽�Ʈ ����
    public static void main(String[] args) {
        CountDownTest countDownTest = new CountDownTest();
        countDownTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        countDownTest.setVisible(true);
    }
}
