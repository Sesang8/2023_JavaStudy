
public class DVDPlayersTest {
	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer ();
		Players b = new DVDPlayer();
		ExPlayers c = new DVDPlayer();
		
		System.out.println("DVDPlayer�� ���� a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Player�� ���� b");
		b.play(); //���
		b.stop(); //���� 
		
		System.out.println("ExPlayer�� ���� c");
		c.play();
		c.stop();
		c.slow();
	}

}


// �������� GUI�� ����� ���� �����ϴ� �� �߰���繮�� 
