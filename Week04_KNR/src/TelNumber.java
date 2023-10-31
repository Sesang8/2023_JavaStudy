import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Person { // Person 클래스 정의
	String name;    // 이름
    String tel;     // 전화번호
    String address; // 주소
	
 // 이름(name)의 getter 메서드
    public String getName() {
        return name;
    }

    // 이름(name)의 setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // 전화번호(tel)의 getter 메서드
    public String getTel() {
        return tel;
    }

    // 전화번호(tel)의 setter 메서드
    public void setTel(String tel) {
        this.tel = tel;
    }

    // 주소(address)의 getter 메서드
    public String getAddress() {
        return address;
    }

    // 주소(address)의 setter 메서드
    public void setAddress(String address) {
        this.address = address;
    }

    // Person 클래스의 생성자
    public Person(String name, String tel, String address) {
        super();
        this.name = name;
        this.tel = tel;
        this.address = address;
    }
}

public class TelNumber extends JFrame {
    ArrayList<Person> list = new ArrayList<>(); // Person 객체를 저장할 ArrayList 생성
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() { // GUI 이벤트 디스패치 스레드에서 실행하도록 Runnable을 사용
            public void run() {
                try {
                    TelNumber frame = new TelNumber(); // TelNumber 클래스의 인스턴스 생성
                    frame.setVisible(true); // 프레임을 화면에 표시
                } catch (Exception e) {
                    e.printStackTrace(); // 예외 발생 시 에러 메시지 출력
                }
            }
        });
    }

    public TelNumber() {
        setTitle("Address Book"); // 프레임의 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임을 닫을 때 프로그램 종료 설정
        setBounds(100, 100, 360, 252); // 프레임의 위치와 크기 설정
        contentPane = new JPanel(); // 패널 생성
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 패널의 경계 여백 설정
        setContentPane(contentPane); // 패널을 프레임의 컨텐츠로 설정
        contentPane.setLayout(null); // 패널의 레이아웃을 null로 설정 (수동 배치)

        // 레이블 및 입력 필드 생성 및 추가
        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setBounds(12, 10, 57, 15);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("전화번호");
        lblNewLabel_1.setBounds(12, 42, 57, 15);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(81, 7, 243, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        textField = new JTextField(); // 두 번째 텍스트 필드 (전화번호 입력) 생성
        textField.setColumns(10);
        textField.setBounds(81, 39, 243, 21);
        contentPane.add(textField);

        JLabel lblNewLabel_2 = new JLabel("주소");
        lblNewLabel_2.setBounds(12, 79, 57, 15);
        contentPane.add(lblNewLabel_2);

        JTextArea textArea = new JTextArea(); // 주소 입력을 위한 텍스트 영역 생성
        textArea.setBounds(12, 104, 312, 67);
        contentPane.add(textArea);
		
        // "저장" 버튼 생성
        JButton btnNewButton = new JButton("저장");
        btnNewButton.setBounds(12, 181, 97, 23); // 버튼의 위치와 크기 설정
        contentPane.add(btnNewButton); // 버튼을 패널에 추가

        // "저장" 버튼에 ActionListener 설정
        btnNewButton.addActionListener(e -> {
            String name = textField.getText(); // 이름 입력 필드에서 입력된 내용을 가져옴
            for (Person p : list) { // 리스트에서 Person 객체를 반복해서 확인
                if (p.getName().equals(name)) { // 만약 Person 객체의 이름이 입력된 이름과 일치하면
                    textField_1.setText(p.getTel()); // 전화번호 입력 필드에 해당 Person 객체의 전화번호를 표시
                    textArea.setText(p.getAddress()); // 주소 입력 영역에 해당 Person 객체의 주소를 표시
                }
            }
        });
        
        JButton btnNewButton_1_1 = new JButton("종료"); // "종료" 버튼 생성
        btnNewButton_1_1.setBounds(227, 181, 97, 23); // 버튼의 위치와 크기 설정
        contentPane.add(btnNewButton_1_1); // 버튼을 패널에 추가

        // "종료" 버튼에 ActionListener 설정
        btnNewButton_1_1.addActionListener(e -> {
            System.exit(0); // 버튼 클릭 시 프로그램을 종료하는 명령
        });
	}
}
