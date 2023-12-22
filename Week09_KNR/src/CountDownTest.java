import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 카운트다운을 테스트하는 클래스 정의
public class CountDownTest extends JFrame {
    private JLabel label;
    private Thread t;

    // 내부 클래스로 Counter 스레드를 상속받아 카운트다운을 수행하는 클래스 정의
    class Counter extends Thread {
        public void run() {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(1000); // 1초 동안 스레드 일시 정지
                } catch (InterruptedException e) {
                    // InterruptedException이 발생하면 스레드 종료
                    return;
                }
                label.setText(i + ""); // 레이블에 현재 카운트 값 표시
            }
        }
    }

    // 생성자: GUI 초기화 및 이벤트 처리 설정
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
        
        // "카운트 시작" 버튼 클릭 시 ActionListener를 통해 스레드를 시작하도록 설정
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
        
        // "카운트 중지" 버튼 클릭 시 ActionListener를 통해 스레드를 중지하도록 설정
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t != null && t.isAlive()) {
                    t.interrupt();
                }
            }
        });
        getContentPane().add(stopButton);
    }

    // main 메서드: CountDownTest 객체를 생성하여 카운트다운 테스트 시작
    public static void main(String[] args) {
        CountDownTest countDownTest = new CountDownTest();
        countDownTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        countDownTest.setVisible(true);
    }
}
