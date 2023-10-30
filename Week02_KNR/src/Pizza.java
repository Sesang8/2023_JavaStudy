class Circle {
	protected int radius;
	public Circle(int r) {radius = r;}
}

public class Pizza extends Circle {
	private String topping;
	
	public Pizza(String topping, int r) {
		super(r);
		this.topping = topping;
	}
	
	public void print() {
		System.out.println(topping + " Pizza"+ ", " + radius + "radius");
	}
	
	public static void main(String args[]) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}
}