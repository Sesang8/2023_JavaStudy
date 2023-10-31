import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TextField extends JFrame {
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton btn1;
	private JButton btn2;
	
	public static void main(String[] args) { // 프로그램의 진입점
	    EventQueue.invokeLater(new Runnable() { 
	        public void run() { // Runnable 인터페이스의 run 메서드를 구현
	            try {
	            	TextField frame = new TextField(); // MemberData 클래스의 인스턴스 생성
	                frame.setVisible(true); // 프레임을 화면에 표시
	            } catch (Exception e) { // 예외 처리 (에러가 발생한 경우)
	                e.printStackTrace(); // 에러 내용을 출력
	            }
	        }
	    });
	}
	
	public TextField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 237);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label = new JLabel("학생 등록하기");
		Label.setFont(new Font("", Font.PLAIN, 16));
		Label.setBounds(120, 10, 140, 25);
		contentPane.add(Label);
		
		JLabel Label1 = new JLabel("이름");
		Label1.setBounds(36, 45, 151, 15);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("학번");
		Label2.setBounds(36, 70, 151, 15);
		contentPane.add(Label2);
		
		JLabel Label3 = new JLabel("성적");
		Label3.setBounds(36, 95, 113, 15);
		contentPane.add(Label3);
		
		
		textField1 = new JTextField();
		textField1.setBounds(187, 45, 116, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(187, 70, 116, 21);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(187, 95, 116, 21);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		
		
		btn1 = new JButton("등록하기");
		btn1.setBounds(70, 140, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("취소");
		btn2.setBounds(186, 140, 97, 23);
		contentPane.add(btn2);
		
		ActionListener listener = 
				new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg1 = textField1.getText();
				String msg2 = textField2.getText();
				String msg3 = textField3.getText();
				System.out.println("이름: "+ msg1 + " 학번: " + msg2 + " 성적: " +msg3);
			}
		};

		btn1.addActionListener(listener);

		
		
	}
	
}