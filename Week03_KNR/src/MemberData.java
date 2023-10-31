import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MemberData extends JFrame {
	private JPanel contentPane;
	private JTextField textField1;
	private JPasswordField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JButton btn1;
	private JButton btn2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberData frame = new MemberData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MemberData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 237);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label = new JLabel("회원 등록하기");
		Label.setFont(new Font("", Font.PLAIN, 16));
		Label.setBounds(120, 10, 140, 25);
		contentPane.add(Label);
		
		JLabel Label1 = new JLabel("이름");
		Label1.setBounds(36, 45, 151, 15);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("패스워드");
		Label2.setBounds(36, 70, 151, 15);
		contentPane.add(Label2);
		
		JLabel Label3 = new JLabel("이메일 주소");
		Label3.setBounds(36, 95, 113, 15);
		contentPane.add(Label3);
		
		JLabel Label4 = new JLabel("전화번호");
		Label4.setBounds(36, 120, 140, 25);
		contentPane.add(Label4);
		
		textField1 = new JTextField();
		textField1.setBounds(187, 45, 116, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JPasswordField();
		textField2.setBounds(187, 70, 116, 21);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(187, 95, 116, 21);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(187, 120, 116, 21);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		
		btn1 = new JButton("등록하기");
		btn1.setBounds(70, 165, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("취소");
		btn2.setBounds(186, 165, 97, 23);
		contentPane.add(btn2);
	}
}