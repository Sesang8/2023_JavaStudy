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
	
	public static void main(String[] args) { // ���α׷��� ������
	    EventQueue.invokeLater(new Runnable() { 
	        public void run() { // Runnable �������̽��� run �޼��带 ����
	            try {
	            	TextField frame = new TextField(); // MemberData Ŭ������ �ν��Ͻ� ����
	                frame.setVisible(true); // �������� ȭ�鿡 ǥ��
	            } catch (Exception e) { // ���� ó�� (������ �߻��� ���)
	                e.printStackTrace(); // ���� ������ ���
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
		
		JLabel Label = new JLabel("�л� ����ϱ�");
		Label.setFont(new Font("", Font.PLAIN, 16));
		Label.setBounds(120, 10, 140, 25);
		contentPane.add(Label);
		
		JLabel Label1 = new JLabel("�̸�");
		Label1.setBounds(36, 45, 151, 15);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("�й�");
		Label2.setBounds(36, 70, 151, 15);
		contentPane.add(Label2);
		
		JLabel Label3 = new JLabel("����");
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
		
		
		
		btn1 = new JButton("����ϱ�");
		btn1.setBounds(70, 140, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("���");
		btn2.setBounds(186, 140, 97, 23);
		contentPane.add(btn2);
		
		ActionListener listener = 
				new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg1 = textField1.getText();
				String msg2 = textField2.getText();
				String msg3 = textField3.getText();
				System.out.println("�̸�: "+ msg1 + " �й�: " + msg2 + " ����: " +msg3);
			}
		};

		btn1.addActionListener(listener);

		
		
	}
	
}