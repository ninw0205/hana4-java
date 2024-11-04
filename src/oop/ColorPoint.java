package oop;

public class ColorPoint extends Point {
	private final String color;

	public ColorPoint(String color) {
		this.color = color;
	}

	@Override
	public void showPoint() {
		System.out.print(this.color + " ");
		super.showPoint();
	}

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.set(10, 20);
		p1.showPoint();
		System.out.println("p1 = " + p1);

		ColorPoint cp = new ColorPoint("red");
		cp.set(100, 200);
		cp.showPoint();
	}

}
