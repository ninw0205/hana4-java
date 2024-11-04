package tryThis.shape;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + this.radius + "]의 둘레는 " + this.getCircumference() + ", 면적은 " + this.getArea();
	}
}
