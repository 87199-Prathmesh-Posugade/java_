import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {
	public static void main(String[] args) {
		int ch, index = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter BucketSize: ");
		int size = s.nextInt();
		Fruit[] bucket = new Fruit[size];
		while ((ch = Fruit.menuDriven(s)) != 9) {
			switch (ch) {
			case 1:
				if (index == size) {
					System.err.print("\nBucket is Full :(\n");
				} else {
					System.out.print("Enter color, name, weight: ");
					bucket[index] = new Mango(s.next(), s.next(), s.nextDouble(), true);
					index++;
				}
				break;
			case 2:
				if (index == size) {
					System.err.print("\nBucket is Full :(\n");
				} else {
					System.out.print("Enter color, name, weight: ");
					bucket[index] = new Orange(s.next(), s.next(), s.nextDouble(), true);
					index++;
				}
				break;
			case 3:
				if (index == size) {
					System.err.print("\nBucket is Full :(\n");
				} else {
					System.out.print("Enter color, name, weight: ");
					bucket[index] = new Apple(s.next(), s.next(), s.nextDouble(), true);
					index++;
				}
				break;
			case 4:
				System.out.println();
				for (int i = 0; i < index; i++) {
					if (i == index - 1) {
						System.out.print(bucket[i].getName() + "\n");
					} else {
						System.out.print(bucket[i].getName() + ", ");
					}
				}
				break;
			case 5:
				System.out.println();
				for (int i = 0; i < index; i++) {
					if (bucket[i].getisFresh()) {
						System.out.print(bucket[i].toString() + "\n");
					}
				}
				break;
			case 6:
				System.out.println();
				for (int i = 0; i < index; i++) {
					if (!bucket[i].getisFresh()) {
						System.out.print(bucket[i].taste() + "\n");
					}
				}
				break;
			case 7:
				System.out.println();
				for (int i = 0; i < index; i++) {
					if (bucket[i].getisFresh()) {
						System.out.print((i + 1) + ". " + bucket[i].toString() + "\n");
					}
				}
				System.out.print("\nEnter Fruit Id: ");
				int toFalse = s.nextInt() - 1;
				if (toFalse < index) {
					if (!bucket[toFalse].getisFresh()) {
						System.err.println("Fruit is already Stale :(");
					} else {
						bucket[toFalse].setisFresh(false);
					}
				} else {
					System.err.println("Fruit is not in Bucket :(");
				}
				break;
			case 8:
				for (int i = 0; i < index; i++) {
					// bucket[i].taste().equals("sour");
					if (bucket[i].taste().contains("sour")) {
						bucket[i].setisFresh(false);
					}
				}
				break;
			default:
				System.err.println("Entered wrong choice...!");
				break;
			}
		}
		System.err.println("\nThank you :)");
	}
}