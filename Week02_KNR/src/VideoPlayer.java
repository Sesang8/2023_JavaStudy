interface Controllable {
	void play();
	void stop();
}


public class VideoPlayer implements Controllable{
	public void play() {
		System.out.println("재생합니다.");
	}
	public void stop() {
		System.out.println("중지합니다.");
	}
	
	public static void main(String[] args) {
		Controllable c = new VideoPlayer();
		c.play();
		c.stop();
	}
}
