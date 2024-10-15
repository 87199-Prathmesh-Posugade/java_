import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] java) {
		double d1, d2;
		System.out.println("Enter Double: ");
		Scanner s = new Scanner(System.in);
		if (!s.hasNextInt() && s.hasNextDouble()) {
			d1 = s.nextDouble();
			if (!s.hasNextInt() && s.hasNextDouble()) {
				d2 = s.nextDouble();
				System.out.println("Average: " + (d1 + d2) / 2);
			} else {
				System.err.println("Second");
			}
		} else {
			System.err.println("First");
		}
		s.close();
	}
}
