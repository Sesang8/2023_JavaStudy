class Circle {
	protected int radius;
	public Circle(int r) {radius = r;}
}

public class Pizza extends Circle {
	public Pizza(String string, int r) {
		super(r);
		System.out.println(string + " Pizza"+ ", " + r + "radius");
	}
	
	public static void main(String args[]) {
		Pizza obj = new Pizza("Pepperoni", 20);
		System.out.println(obj);
	}
}