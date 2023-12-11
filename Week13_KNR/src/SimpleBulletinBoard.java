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

    // 게시물 작성
    public void create() {
        try {
            System.out.print("제목: ");
            String title = reader.readLine();
            System.out.print("내용: ");
            String content = reader.readLine();
            System.out.print("작성자: ");
            String writer = reader.readLine();

            // 현재 날짜 가져오기
            LocalDate currentDate = LocalDate.now();
            String date = currentDate.toString();

            Post post = new Post(title, content, writer, date);

            System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
            int subMenuChoice = Integer.parseInt(reader.readLine());

            if (subMenuChoice == 1) {
                posts.add(post);
                System.out.println("게시물이 저장되었습니다.");
            } else if (subMenuChoice == 2) {
                System.out.println("게시물 작성이 취소되었습니다.");
            } else {
                System.out.println("잘못된 선택입니다. 작성이 취소되었습니다.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    // 게시물 조회
    public void read() {
        if (posts.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("no\twriter\t\tdate\t\ttitle");
            System.out.println("-------------------------------------------");

            for (int i = posts.size() - 1; i >= 0; i--) {
                Post post = posts.get(i);
                System.out.println((i + 1) + "\t" + post.getWriter() + "\t\t" + post.getDate() + "\t" + post.getTitle());
            }

            try {
                System.out.print("게시물 번호를 입력하세요: ");
                int selectedPostIndex = Integer.parseInt(reader.readLine()) - 1;

                if (selectedPostIndex >= 0 && selectedPostIndex < posts.size()) {
                    Post selectedPost = posts.get(selectedPostIndex);
                    System.out.println("-------------------------------------------");
                    System.out.println("번호: " + (selectedPostIndex + 1));
                    System.out.println("제목: " + selectedPost.getTitle());
                    System.out.println("내용: " + selectedPost.getContent());
                    System.out.println("작성자: " + selectedPost.getWriter());
                    System.out.println("날짜: " + selectedPost.getDate());
                } else {
                    System.out.println("유효하지 않은 게시물 번호입니다.");
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }



    // 게시물 초기화
    public void clear() {
        if (posts.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            try {
                System.out.print("삭제할 게시물 번호를 입력하세요: ");
                int deletePostNumber = Integer.parseInt(reader.readLine());

                boolean found = false;
                for (int i = 0; i < posts.size(); i++) {
                    Post post = posts.get(i);
                    if (post.getPostNumber() == deletePostNumber) {
                        posts.remove(i);
                        found = true;
                        System.out.println("게시물이 삭제되었습니다.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 번호의 게시물을 찾을 수 없습니다.");
                }

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    // 프로그램 종료
    public void exit() {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }

    public static void main(String[] args) {
        SimpleBulletinBoard bulletinBoard = new SimpleBulletinBoard();

        while (true) {
            System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
            System.out.print("메뉴 선택: ");

            try {
                int choice = Integer.parseInt(bulletinBoard.reader.readLine());
                System.out.println("-------------------------------------------");

                switch (choice) {
                    case 1:
                        System.out.println("[새 게시물 입력]");
                        bulletinBoard.create();
                        break;
                    case 2:
                        System.out.println("[게시물 목록]");
                        bulletinBoard.read();
                        break;
                    case 3:
                        bulletinBoard.clear();
                        break;
                    case 4:
                        bulletinBoard.exit();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
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
        return "작성자: " + writer + "\n날짜: " + date + "\n제목: " + title + "\n내용: " + content;
    }
}
