interface Controllable {
	void play();
	void stop();
}


public class VideoPlayer implements Controllable{
	public void play() {
		System.out.println("����մϴ�.");
	}
	public void stop() {
		System.out.println("�����մϴ�.");
	}
	
	public static void main(String[] args) {
		Controllable c = new VideoPlayer();
		c.play();
		c.stop();
	}
}
