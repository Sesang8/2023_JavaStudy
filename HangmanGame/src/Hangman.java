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

        // GUI ��� ���� �г�
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // �ʱ� ���� ����(�ܾ� ����ŭ _ ���)
        guessedWord = new StringBuilder("_ ".repeat(secretWord.length()) + "(" + secretWord.length() + ")");
        incorrectGuesses = new HashSet<>();
        correctGuesses = new HashSet<>();

        // GUI �ʱ�ȭ
        wordLabel = new JLabel("����: " + guessedWord.toString());
        attemptsLabel = new JLabel(attempts + "/" + maxAttempts);
        hangmanLabel = new JLabel();
        incorrectLabel = new JLabel("����: ");

        // ��� �׸� �ʱ� �̹��� ����
        hangmanLabel.setIcon(new ImageIcon("Hangman0.png"));

        // ��� �׸� ũ�� ����
        ImageIcon hangmanIcon = new ImageIcon("Hangman0.png");
        Image image = hangmanIcon.getImage();
        Image newimg = image.getScaledInstance(240, 300, java.awt.Image.SCALE_SMOOTH);
        hangmanIcon = new ImageIcon(newimg);
        hangmanLabel.setIcon(hangmanIcon);

        // �Է� �޴� �ؽ�Ʈ �ʵ�/��ư ����
        JButton guessButton = new JButton("Guess");
        JTextField guessField = new JTextField(3);

        // ��� �߰�
        panel.add(guessField);
        panel.add(guessButton);

        // ��ü ���̾ƿ� ����
        setLayout(new BorderLayout());
        add(wordLabel, BorderLayout.NORTH);
        add(attemptsLabel, BorderLayout.CENTER);
        add(hangmanLabel, BorderLayout.EAST);
        add(incorrectLabel, BorderLayout.WEST);
        add(panel, BorderLayout.SOUTH);

        // ��ư �̺�Ʈ ó���ϴ� �κ�
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ����ڰ� �Է��� ���� �����´�
                String guess = guessField.getText().toLowerCase();

                // �ϳ��� ���ĺ� ������ ��쿡�� ó���ϵ���
                if (guess.length() == 1 && Character.isLetter(guess.charAt(0))) {
                    processGuess(guess.charAt(0));
                } else {
                    JOptionPane.showMessageDialog(Hangman.this, "���ڸ� �Է����ּ���.");
                }

                // �Է� �ʱ�ȭ
                guessField.setText("");
            }
        });

        // ������ ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);

        // ���� ���� 1�� ����ÿ� ��Ʈ�� ǥ���ϴ� ������ ����
        new Thread(() -> {
            try {
                Thread.sleep(60000);
                showHint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // ��Ʈ ǥ�� 
    private void showHint() {
        // �̹� ���� ���ڸ� ������ ���� �߿��� �������� ��Ʈ �����ϵ��� ����
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
            JOptionPane.showMessageDialog(this, "��Ʈ: " + hintChar);
        } else {
            JOptionPane.showMessageDialog(this, "�� �̻� ��Ʈ�� �� �� �����ϴ�.");
        }
    }

    // ���� �ܾ� ���� 
    private void selectRandomWord() {
        Random random = new Random();
        secretWord = wordArray[random.nextInt(wordArray.length)];
    }

    // ������� ���� ó��
    private void processGuess(char guess) {
        if (secretWord.indexOf(guess) != -1) {
            // ������ ���
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord.setCharAt(i * 2, guess);
                    correctGuesses.add(guess);  // ���� ���� ���� --> ��Ʈ ����... ���� �ʿ�
                }
            }
        } else {
            // ������ ���
            incorrectGuesses.add(guess);
            attempts++;
            updateHangmanImage();
        }

        // UI ������Ʈ
        updateUI();

        // ���� ��� ���� ���
        if (guessedWord.toString().replaceAll(" ", "").equals(secretWord)) {
            JOptionPane.showMessageDialog(this, "�����մϴ�! ������ ���߼̽��ϴ�!");
            resetGame();
        } else if (attempts == maxAttempts) {
            // �ִ� �õ� Ƚ���� �ʰ��� ��� => ���� ���� 
            JOptionPane.showMessageDialog(this, "���� ����! ������: " + secretWord);
            resetGame();
        }
    }

    // UI ������Ʈ
    private void updateUI() {
        String incorrectGuessesText = attempts + "/" + maxAttempts + " (" + incorrectGuesses + ")";
        attemptsLabel.setText(incorrectGuessesText);
        wordLabel.setText("����: " + guessedWord.toString());
    }

    // ��� �׸� ������Ʈ
    private void updateHangmanImage() {
        String hangmanImage = "Hangman" + attempts + ".png";
        ImageIcon hangmanIcon = new ImageIcon(hangmanImage);
        Image image = hangmanIcon.getImage();
        Image newimg = image.getScaledInstance(240, 300, java.awt.Image.SCALE_SMOOTH);
        hangmanIcon = new ImageIcon(newimg);
        hangmanLabel.setIcon(hangmanIcon);
    }

    // ���� ����
    private void resetGame() {
        selectRandomWord();
        guessedWord = new StringBuilder("_ ".repeat(secretWord.length()) + "(" + secretWord.length() + ")");
        incorrectGuesses.clear();
        correctGuesses.clear();
        attempts = 0;
        updateUI();
        updateHangmanImage();
    }

    // ���� �޼���
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Hangman());
    }
}
