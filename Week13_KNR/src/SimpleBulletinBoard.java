import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class SimpleBulletinBoard {
    private ArrayList<Post> posts;
    private BufferedReader reader;

    public SimpleBulletinBoard() {
        this.posts = new ArrayList<>();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    // �Խù� �ۼ�
    public void create() {
        try {
            System.out.print("����: ");
            String title = reader.readLine();
            System.out.print("����: ");
            String content = reader.readLine();
            System.out.print("�ۼ���: ");
            String writer = reader.readLine();

            // ���� ��¥ ��������
            LocalDate currentDate = LocalDate.now();
            String date = currentDate.toString();

            Post post = new Post(title, content, writer, date);

            System.out.println("���� �޴�: 1. Ok | 2. Cancel");
            int subMenuChoice = Integer.parseInt(reader.readLine());

            if (subMenuChoice == 1) {
                posts.add(post);
                System.out.println("�Խù��� ����Ǿ����ϴ�.");
            } else if (subMenuChoice == 2) {
                System.out.println("�Խù� �ۼ��� ��ҵǾ����ϴ�.");
            } else {
                System.out.println("�߸��� �����Դϴ�. �ۼ��� ��ҵǾ����ϴ�.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    // �Խù� ��ȸ
    public void read() {
        if (posts.isEmpty()) {
            System.out.println("�Խù��� �����ϴ�.");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("no\twriter\t\tdate\t\ttitle");
            System.out.println("-------------------------------------------");

            for (int i = posts.size() - 1; i >= 0; i--) {
                Post post = posts.get(i);
                System.out.println((i + 1) + "\t" + post.getWriter() + "\t\t" + post.getDate() + "\t" + post.getTitle());
            }

            try {
                System.out.print("�Խù� ��ȣ�� �Է��ϼ���: ");
                int selectedPostIndex = Integer.parseInt(reader.readLine()) - 1;

                if (selectedPostIndex >= 0 && selectedPostIndex < posts.size()) {
                    Post selectedPost = posts.get(selectedPostIndex);
                    System.out.println("-------------------------------------------");
                    System.out.println("��ȣ: " + (selectedPostIndex + 1));
                    System.out.println("����: " + selectedPost.getTitle());
                    System.out.println("����: " + selectedPost.getContent());
                    System.out.println("�ۼ���: " + selectedPost.getWriter());
                    System.out.println("��¥: " + selectedPost.getDate());
                } else {
                    System.out.println("��ȿ���� ���� �Խù� ��ȣ�Դϴ�.");
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }



    // �Խù� �ʱ�ȭ
    public void clear() {
        if (posts.isEmpty()) {
            System.out.println("�Խù��� �����ϴ�.");
        } else {
            try {
                System.out.print("������ �Խù� ��ȣ�� �Է��ϼ���: ");
                int deletePostNumber = Integer.parseInt(reader.readLine());

                boolean found = false;
                for (int i = 0; i < posts.size(); i++) {
                    Post post = posts.get(i);
                    if (post.getPostNumber() == deletePostNumber) {
                        posts.remove(i);
                        found = true;
                        System.out.println("�Խù��� �����Ǿ����ϴ�.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("�ش� ��ȣ�� �Խù��� ã�� �� �����ϴ�.");
                }

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    // ���α׷� ����
    public void exit() {
        System.out.println("���α׷��� �����մϴ�.");
        System.exit(0);
    }

    public static void main(String[] args) {
        SimpleBulletinBoard bulletinBoard = new SimpleBulletinBoard();

        while (true) {
            System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
            System.out.print("�޴� ����: ");

            try {
                int choice = Integer.parseInt(bulletinBoard.reader.readLine());
                System.out.println("-------------------------------------------");

                switch (choice) {
                    case 1:
                        System.out.println("[�� �Խù� �Է�]");
                        bulletinBoard.create();
                        break;
                    case 2:
                        System.out.println("[�Խù� ���]");
                        bulletinBoard.read();
                        break;
                    case 3:
                        bulletinBoard.clear();
                        break;
                    case 4:
                        bulletinBoard.exit();
                        break;
                    default:
                        System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
                }
                System.out.println("-------------------------------------------");
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}

class Post {
    private static int nextPostNumber = 1; 
    private int postNumber; 
    private String title;
    private String content;
    private String writer;
    private String date;

    public Post(String title, String content, String writer, String date) {
        this.postNumber = nextPostNumber++; 
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "�ۼ���: " + writer + "\n��¥: " + date + "\n����: " + title + "\n����: " + content;
    }
}
