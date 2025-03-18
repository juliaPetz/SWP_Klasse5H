package refactorMe;

public class Circle extends Geometry {

	private final int id;
	private double radius;
	private final boolean filled;
	private final String color;

	protected Circle(int id, double radius, boolean filled, String color) throws IdException {

		super(id, filled, color);
		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.filled = filled;
		this.color = color;

		if (radius < 0) {
			System.out.println("Radius less than zero not allowed!");
		}

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}
