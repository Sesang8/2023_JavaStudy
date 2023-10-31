import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Person { // Person Ŭ���� ����
	String name;    // �̸�
    String tel;     // ��ȭ��ȣ
    String address; // �ּ�
	
 // �̸�(name)�� getter �޼���
    public String getName() {
        return name;
    }

    // �̸�(name)�� setter �޼���
    public void setName(String name) {
        this.name = name;
    }

    // ��ȭ��ȣ(tel)�� getter �޼���
    public String getTel() {
        return tel;
    }

    // ��ȭ��ȣ(tel)�� setter �޼���
    public void setTel(String tel) {
        this.tel = tel;
    }

    // �ּ�(address)�� getter �޼���
    public String getAddress() {
        return address;
    }

    // �ּ�(address)�� setter �޼���
    public void setAddress(String address) {
        this.address = address;
    }

    // Person Ŭ������ ������
    public Person(String name, String tel, String address) {
        super();
        this.name = name;
        this.tel = tel;
        this.address = address;
    }
}

public class TelNumber extends JFrame {
    ArrayList<Person> list = new ArrayList<>(); // Person ��ü�� ������ ArrayList ����
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() { // GUI �̺�Ʈ ����ġ �����忡�� �����ϵ��� Runnable�� ���
            public void run() {
                try {
                    TelNumber frame = new TelNumber(); // TelNumber Ŭ������ �ν��Ͻ� ����
                    frame.setVisible(true); // �������� ȭ�鿡 ǥ��
                } catch (Exception e) {
                    e.printStackTrace(); // ���� �߻� �� ���� �޽��� ���
                }
            }
        });
    }

    public TelNumber() {
        setTitle("Address Book"); // �������� ���� ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� �� ���α׷� ���� ����
        setBounds(100, 100, 360, 252); // �������� ��ġ�� ũ�� ����
        contentPane = new JPanel(); // �г� ����
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // �г��� ��� ���� ����
        setContentPane(contentPane); // �г��� �������� �������� ����
        contentPane.setLayout(null); // �г��� ���̾ƿ��� null�� ���� (���� ��ġ)

        // ���̺� �� �Է� �ʵ� ���� �� �߰�
        JLabel lblNewLabel = new JLabel("�̸�");
        lblNewLabel.setBounds(12, 10, 57, 15);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("��ȭ��ȣ");
        lblNewLabel_1.setBounds(12, 42, 57, 15);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(81, 7, 243, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        textField = new JTextField(); // �� ��° �ؽ�Ʈ �ʵ� (��ȭ��ȣ �Է�) ����
        textField.setColumns(10);
        textField.setBounds(81, 39, 243, 21);
        contentPane.add(textField);

        JLabel lblNewLabel_2 = new JLabel("�ּ�");
        lblNewLabel_2.setBounds(12, 79, 57, 15);
        contentPane.add(lblNewLabel_2);

        JTextArea textArea = new JTextArea(); // �ּ� �Է��� ���� �ؽ�Ʈ ���� ����
        textArea.setBounds(12, 104, 312, 67);
        contentPane.add(textArea);
		
        // "����" ��ư ����
        JButton btnNewButton = new JButton("����");
        btnNewButton.setBounds(12, 181, 97, 23); // ��ư�� ��ġ�� ũ�� ����
        contentPane.add(btnNewButton); // ��ư�� �гο� �߰�

        // "����" ��ư�� ActionListener ����
        btnNewButton.addActionListener(e -> {
            String name = textField.getText(); // �̸� �Է� �ʵ忡�� �Էµ� ������ ������
            for (Person p : list) { // ����Ʈ���� Person ��ü�� �ݺ��ؼ� Ȯ��
                if (p.getName().equals(name)) { // ���� Person ��ü�� �̸��� �Էµ� �̸��� ��ġ�ϸ�
                    textField_1.setText(p.getTel()); // ��ȭ��ȣ �Է� �ʵ忡 �ش� Person ��ü�� ��ȭ��ȣ�� ǥ��
                    textArea.setText(p.getAddress()); // �ּ� �Է� ������ �ش� Person ��ü�� �ּҸ� ǥ��
                }
            }
        });
        
        JButton btnNewButton_1_1 = new JButton("����"); // "����" ��ư ����
        btnNewButton_1_1.setBounds(227, 181, 97, 23); // ��ư�� ��ġ�� ũ�� ����
        contentPane.add(btnNewButton_1_1); // ��ư�� �гο� �߰�

        // "����" ��ư�� ActionListener ����
        btnNewButton_1_1.addActionListener(e -> {
            System.exit(0); // ��ư Ŭ�� �� ���α׷��� �����ϴ� ���
        });
	}
}
