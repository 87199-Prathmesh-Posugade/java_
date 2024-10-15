import java.util.Scanner;

public class Assignment0201 {
	public static void main(String[] args) {
		System.out.println("Enter Integer: ");
		Scanner s = new Scanner(System.in);
		int j = s.nextInt();
		System.out.println("Equivalent Binary: " + Integer.toBinaryString(j));
		System.out.println("Equivalent Octal: " + Integer.toOctalString(j));
		System.out.println("Equivalent Hex: " + Integer.toHexString(j));
		s.close();
	}
}
