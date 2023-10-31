import java.awt.event.ItemEvent; // ItemEvent를 사용하기 위한 import 문
import java.awt.event.ItemListener; // ItemListener를 사용하기 위한 import 문
import javax.swing.Box; // Box 클래스를 사용하기 위한 import 문
import javax.swing.BoxLayout; // BoxLayout을 사용하기 위한 import 문
import javax.swing.JCheckBox; // JCheckBox를 사용하기 위한 import 문
import javax.swing.JFrame; // JFrame을 사용하기 위한 import 문
import javax.swing.JLabel; // JLabel을 사용하기 위한 import 문
import javax.swing.JPanel; // JPanel을 사용하기 위한 import 문
import javax.swing.SwingUtilities; // SwingUtilities를 사용하기 위한 import 문

// Repair 클래스 정의
public class Repair extends JPanel implements ItemListener {
    JCheckBox buttons[] = new JCheckBox[4]; // JCheckBox 배열 선언
    String items[] = {"엔진 오일 교환", "자동 변속기 오일 교환", "에어콘 필터 교환", "타이어 교환"}; // 서비스 항목 배열
    int prices[] = {45000, 80000, 30000, 100000}; // 각 항목의 가격 배열
    int money = 0; // 서비스 항목을 선택한 경우의 총 가격을 저장하는 변수
    JLabel label; // 결과를 표시할 레이블

    // Repair 클래스 생성자
    public Repair() {
        super(); // 부모 클래스의 생성자 호출

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // 레이아웃 매니저 설정 (수직 박스 레이아웃)

        JPanel checkBoxPanel = new JPanel(); // 체크박스를 담을 패널 생성
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JCheckBox(items[i]); // JCheckBox 생성 및 항목명 설정
            buttons[i].addItemListener(this); // 각 체크박스에 ItemListener 연결
            checkBoxPanel.add(buttons[i]); // 패널에 체크박스 추가
        }
        add(checkBoxPanel); // 전체 패널에 체크박스 패널 추가

        add(Box.createVerticalGlue()); // 수직 가운데 정렬을 위한 빈 공간 추가

        label = new JLabel("현재의 가격은 " + money + "원입니다"); // 결과를 표시할 레이블 생성
        label.setAlignmentX(CENTER_ALIGNMENT); // 레이블을 가운데 정렬
        add(label); // 전체 패널에 결과 레이블 추가
    }

    // 체크박스 상태가 변경될 때 호출되는 메서드
    @Override
    public void itemStateChanged(ItemEvent e) {
        money = 0; // 총 가격 초기화
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                money += prices[i]; // 선택된 항목의 가격을 총 가격에 추가
            }
        }

        label.setText("현재의 가격은 " + money + "원입니다"); // 결과 레이블 업데이트
    }

    // 메인 메서드
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Car Repair"); // JFrame 생성
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫을 때 프로그램 종료 설정
            frame.add(new Repair()); // Repair 패널을 프레임에 추가
            frame.pack(); // 프레임 크기 조정
            frame.setVisible(true); // 프레임을 화면에 표시
        });
    }
}
