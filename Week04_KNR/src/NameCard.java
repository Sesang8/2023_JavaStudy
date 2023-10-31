import java.awt.BorderLayout; // BorderLayout을 사용하기 위한 import 문
import java.awt.Image; // Image를 사용하기 위한 import 문
import javax.swing.ImageIcon; // ImageIcon을 사용하기 위한 import 문
import javax.swing.JFrame; // JFrame을 사용하기 위한 import 문
import javax.swing.JLabel; // JLabel을 사용하기 위한 import 문
import javax.swing.JPanel; // JPanel을 사용하기 위한 import 문
import javax.swing.JTextField; // JTextField를 사용하기 위한 import 문
import javax.swing.SwingUtilities; // SwingUtilities를 사용하기 위한 import 문

public class NameCard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BusinessCard"); // JFrame 생성 및 제목 설정
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임을 닫을 때 프로그램 종료 설정
            frame.setSize(250, 160); // 프레임의 크기 설정

            JPanel panel = new JPanel(); // 패널 생성
            panel.setLayout(null); // 패널의 레이아웃 매니저를 수동 배치로 설정

            ImageIcon imageIcon = new ImageIcon("cat.png"); // 이미지 파일을 로드한 ImageIcon 생성

            Image image = imageIcon.getImage(); // 이미지 아이콘에서 이미지 객체 추출
            Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // 이미지 크기 조절
            ImageIcon scaledIcon = new ImageIcon(scaledImage); // 크기 조절된 이미지로 새로운 ImageIcon 생성

            JLabel imageLabel = new JLabel(scaledIcon); // 크기 조절된 이미지를 표시할 레이블 생성
            imageLabel.setBounds(10, 10, 100, 100); // 레이블의 위치와 크기 설정
            panel.add(imageLabel); // 패널에 이미지 레이블 추가

            JPanel textPanel = new JPanel(); // 텍스트 정보를 담을 패널 생성
            textPanel.setLayout(null); // 패널의 레이아웃 매니저를 수동 배치로 설정

            // 이름을 나타내는 레이블 생성 및 설정
            JLabel lblNewLabel = new JLabel("김춘식");
            lblNewLabel.setBounds(60, 20, 80, 15); // 레이블의 위치와 크기 설정
            textPanel.add(lblNewLabel); // 텍스트 패널에 이름 레이블 추가

            // 직업을 나타내는 레이블 생성 및 설정
            JLabel lblNewLabel_1 = new JLabel("홈프로텍터");
            lblNewLabel_1.setBounds(60, 40, 80, 15); // 레이블의 위치와 크기 설정
            textPanel.add(lblNewLabel_1); // 텍스트 패널에 직업 레이블 추가

            // 회사 정보를 나타내는 레이블 생성 및 설정
            JLabel lblNewLabel_2 = new JLabel("카카오 주식회사");
            lblNewLabel_2.setBounds(60, 60, 100, 15); // 레이블의 위치와 크기 설정
            textPanel.add(lblNewLabel_2); // 텍스트 패널에 회사 정보 레이블 추가

            textPanel.setBounds(60, 10, 160, 120); // 텍스트 패널의 위치와 크기 설정
            panel.add(textPanel); // 패널에 텍스트 패널 추가

            frame.add(panel); // 프레임에 패널 추가
            frame.setVisible(true); // 프레임을 화면에 표시
        });
    }
}
