class Sports{
	String getName() {	return "���� �������� ����";}
	int getPlayers() {	return 0;	}
}

class Soccer extends Sports{
	@Override
	String getName() {	return "�౸";}
	
	@Override
	int getPlayers() {	return 11;}
}

public class SoccerTest {
	public static void main(String[] args) {
		Soccer obj = new Soccer();
		System.out.println("����̸�: "+ obj.getName());
		System.out.println("����ڼ�: "+ obj.getPlayers());
	}

}
