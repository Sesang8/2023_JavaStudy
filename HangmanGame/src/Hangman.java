import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hangman extends JFrame {
    private String[] wordArray = {"midnight", "bride", "change", "postcard", "candy", "window", "travel", "love", "sunshine", "rain", "smile", "sunrise",
            "conversation", "taylor", "forever", "duksung", "desktop", "pears", "pineapples", "computer", "world", "dice", "prince", "paint",
            "american", "wiser", "storm", "whisper", "school", "university", "angel", "devil"};
    private String secretWord;
    private Set<Character> incorrectGuesses;
    private Set<Character> correctGuesses;
    private StringBuilder guessedWord;
    private int attempts = 0;
    private int maxAttempts = 6;

    private JLabel wordLabel;
    private JLabel attemptsLabel;
    private JLabel hangmanLabel;
    private JLabel incorrectLabel;

    public Hangman() {
        selectRandomWord();

        // GUI 요소 담을 패널
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // 초기 게임 상태(단어 수만큼 _ 출력)
        guessedWord = new StringBuilder("_ ".repeat(secretWord.length()) + "(" + secretWord.length() + ")");
        incorrectGuesses = new HashSet<>();
        correctGuesses = new HashSet<>();

        // GUI 초기화
        wordLabel = new JLabel("정답: " + guessedWord.toString());
        attemptsLabel = new JLabel(attempts + "/" + maxAttempts);
        hangmanLabel = new JLabel();
        incorrectLabel = new JLabel("오답: ");

        // 행맨 그림 초기 이미지 설정
        hangmanLabel.setIcon(new ImageIcon("Hangman0.png"));

        // 행맨 그림 크기 조정
        ImageIcon hangmanIcon = new ImageIcon("Hangman0.png");
        Image image = hangmanIcon.getImage();
        Image newimg = image.getScaledInstance(240, 300, java.awt.Image.SCALE_SMOOTH);
        hangmanIcon = new ImageIcon(newimg);
        hangmanLabel.setIcon(hangmanIcon);

        // 입력 받는 텍스트 필드/버튼 생성
        JButton guessButton = new JButton("Guess");
        JTextField guessField = new JTextField(3);

        // 요소 추가
        panel.add(guessField);
        panel.add(guessButton);

        // 전체 레이아웃 설정
        setLayout(new BorderLayout());
        add(wordLabel, BorderLayout.NORTH);
        add(attemptsLabel, BorderLayout.CENTER);
        add(hangmanLabel, BorderLayout.EAST);
        add(incorrectLabel, BorderLayout.WEST);
        add(panel, BorderLayout.SOUTH);

        // 버튼 이벤트 처리하는 부분
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 사용자가 입력한 글자 가져온다
                String guess = guessField.getText().toLowerCase();

                // 하나의 알파벳 문자인 경우에만 처리하도록
                if (guess.length() == 1 && Character.isLetter(guess.charAt(0))) {
                    processGuess(guess.charAt(0));
                } else {
                    JOptionPane.showMessageDialog(Hangman.this, "문자를 입력해주세요.");
                }

                // 입력 초기화
                guessField.setText("");
            }
        });

        // 프레임 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);

        // 게임 시작 1분 경과시에 힌트를 표시하는 스레드 시작
        new Thread(() -> {
            try {
                Thread.sleep(60000);
                showHint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // 힌트 표시 
    private void showHint() {
        // 이미 맞힌 문자를 제외한 문자 중에서 랜덤으로 힌트 선택하도록 조정
        Set<Character> remainingChars = new HashSet<>();
        for (int i = 0; i < secretWord.length(); i++) {
            char currentChar = secretWord.charAt(i);
            if (!correctGuesses.contains(currentChar)) {
                remainingChars.add(currentChar);
            }
        }

        if (!remainingChars.isEmpty()) {
            int randomIndex = new Random().nextInt(remainingChars.size());
            char hintChar = (char) remainingChars.toArray()[randomIndex];
            JOptionPane.showMessageDialog(this, "힌트: " + hintChar);
        } else {
            JOptionPane.showMessageDialog(this, "더 이상 힌트를 줄 수 없습니다.");
        }
    }

    // 랜덤 단어 선택 
    private void selectRandomWord() {
        Random random = new Random();
        secretWord = wordArray[random.nextInt(wordArray.length)];
    }

    // 사용자의 추측 처리
    private void processGuess(char guess) {
        if (secretWord.indexOf(guess) != -1) {
            // 정답인 경우
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord.setCharAt(i * 2, guess);
                    correctGuesses.add(guess);  // 맞힌 문자 저장 --> 힌트 제외... 위해 필요
                }
            }
        } else {
            // 오답인 경우
            incorrectGuesses.add(guess);
            attempts++;
            updateHangmanImage();
        }

        // UI 업데이트
        updateUI();

        // 정답 모두 맞춘 경우
        if (guessedWord.toString().replaceAll(" ", "").equals(secretWord)) {
            JOptionPane.showMessageDialog(this, "축하합니다! 정답을 맞추셨습니다!");
            resetGame();
        } else if (attempts == maxAttempts) {
            // 최대 시도 횟수를 초과한 경우 => 게임 실패 
            JOptionPane.showMessageDialog(this, "게임 종료! 정답은: " + secretWord);
            resetGame();
        }
    }

    // UI 업데이트
    private void updateUI() {
        String incorrectGuessesText = attempts + "/" + maxAttempts + " (" + incorrectGuesses + ")";
        attemptsLabel.setText(incorrectGuessesText);
        wordLabel.setText("정답: " + guessedWord.toString());
    }

    // 행맨 그림 업데이트
    private void updateHangmanImage() {
        String hangmanImage = "Hangman" + attempts + ".png";
        ImageIcon hangmanIcon = new ImageIcon(hangmanImage);
        Image image = hangmanIcon.getImage();
        Image newimg = image.getScaledInstance(240, 300, java.awt.Image.SCALE_SMOOTH);
        hangmanIcon = new ImageIcon(newimg);
        hangmanLabel.setIcon(hangmanIcon);
    }

    // 게임 리셋
    private void resetGame() {
        selectRandomWord();
        guessedWord = new StringBuilder("_ ".repeat(secretWord.length()) + "(" + secretWord.length() + ")");
        incorrectGuesses.clear();
        correctGuesses.clear();
        attempts = 0;
        updateUI();
        updateHangmanImage();
    }

    // 메인 메서드
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Hangman());
    }
}
