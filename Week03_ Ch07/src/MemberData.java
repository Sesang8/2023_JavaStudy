import javax.swing.*;
import java.awt.*;

public class MemberData extends JFrame {
    public MemberData() {
        setTitle("회원 등록하기");
        setSize(400, 200); // 크기 조정

        JPanel panel = new JPanel(new GridLayout(5, 2)); // 5행 2열의 GridLayout 사용
        add(panel);

        panel.add(new JLabel("이름"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("패스워드"));
        panel.add(new JPasswordField(20));
        panel.add(new JLabel("이메일 주소"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("전화번호"));
        panel.add(new JTextField(20));

        JButton button1 = new JButton("등록하기");
        panel.add(button1);

        JButton button2 = new JButton("취소");
        panel.add(button2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemberData();
            }
        });
    }
}
