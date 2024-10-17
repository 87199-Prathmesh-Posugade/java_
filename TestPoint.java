import java.util.Scanner;

public class Point2D {
	private double x;
	private double y;
	final static Scanner s = new Scanner(System.in);

	public Point2D() {
		this(.0, .0);
	}

	public Point2D(double a, double b) {
		x = a;
		y = b;
	}

	public void acceptCood() {
		System.out.println("Enter x and y: ");
		x = s.nextDouble();
		y = s.nextDouble();
	}

	public String getDetails() {
		return "x: " + x + " y: " + y;
	}

	public boolean isEqual(Point2D o) {
		if (x == o.x && y == o.y) {
			return true;
		}
		return false;
	}

	public double calculateDistance(Point2D d) {
		return Math.sqrt(Math.pow((x - d.x), 2) + Math.pow((y - d.y), 2));
	}
}

public class TestPoint {

	public static void main(String[] args) {
		Point2D p = new Point2D();
		Point2D p1 = new Point2D();
		p.acceptCood();
		p1.acceptCood();
		if (p.isEqual(p1)) {
			System.out.println("Co-ordinates are equal: " + p.getDetails());
		} else {
			System.out.println("Distance: " + p.calculateDistance(p1));
		}
	}

}
