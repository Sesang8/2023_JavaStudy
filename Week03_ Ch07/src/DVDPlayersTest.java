
public class DVDPlayersTest {
	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer ();
		Players b = new DVDPlayer();
		ExPlayers c = new DVDPlayer();
		
		System.out.println("DVDPlayer형 변수 a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Player형 변수 b");
		b.play(); //재생
		b.stop(); //정지 
		
		System.out.println("ExPlayer형 변수 c");
		c.play();
		c.stop();
		c.slow();
	}

}


// 리모콘을 GUI로 만들고 동작 구현하는 거 중간고사문제 
