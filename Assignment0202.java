import java.util.Scanner;

public class Assignment0202 {
	static int m1() {
		System.out.println("Chef. Amol Amane");
		System.out.println("10. Exit");
		System.out.println("1. Dosa Rs. 30");
		System.out.println("2. Samosa Rs. 15");
		System.out.println("3. Idli Rs. 10");
		System.out.println("4. Pohe Rs. 20");
		System.out.println("5. Lapsy Rs. 40");
		System.out.println("6. Upit Rs. 50");
		System.out.println("7. Ragada Rs. 60");
		System.out.println("8. Pani-Puri Rs. 55");
		System.out.println("9. Dabheli Rs. 35");
		System.out.println("Enter choice: ");
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		return key;
	}

	public static void main(String[] args) {
		int key;
		double bill = 0;
		do {
			switch (key = m1()) {
			case 1:
				bill = bill + 30;
				break;
			case 2:
				bill = bill + 15;
				break;
			case 3:
				bill = bill + 10;
				break;
			case 4:
				bill = bill + 20;
				break;
			case 5:
				bill = bill + 40;
				break;
			case 6:
				bill = bill + 50;
				break;
			case 7:
				bill = bill + 60;
				break;
			case 8:
				bill = bill + 55;
				break;
			case 9:
				bill = bill + 35;
				break;
			case 10:
				System.out.println("Total Bill: Rs. " + bill);
				System.out.println("Visit Again :)");
				break;
			default:
				System.err.println("Check menu :(");
				break;
			}
		} while (key != 10);
	}
}
