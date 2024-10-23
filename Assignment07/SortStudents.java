import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class ByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class ByCity implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class ByMarks implements Comparator<Student> {
	@Override
	public int compare(Student o2, Student o1) {
		return Double.compare(o1.getMarks(), o2.getMarks());
	}
}

public class SortStudents {

	public static <T> void displayArray(T[] obj) {
		System.out.println();
		for (T ele : obj) {
			System.out.println(ele.toString());
		}
		System.out.println();
	}

	public static int menuDriven(Scanner sc) {
		System.out.println("0. Exit");
		System.out.println("1. sorted on their city (asc)");
		System.out.println("2. sorted on their on marks (desc)");
		System.out.println("3. sorted on their on name (asc)");
		System.out.println("4. sorted on the rollno (comparable)");
		System.out.print("Enter Choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[5];
		s[0] = new Student(1, "Bhushan", "Pandharpur", 2343.24);
		s[1] = new Student(3, "Vishal", "Karad", 423.4);
		s[2] = new Student(9, "Prathamesh", "Bagani", 2323.423);
		s[3] = new Student(5, "Ritesh", "Kholhapur", 234.20);
		s[4] = new Student(4, "Mayur", "Nagar", 32452.20);

		while ((ch = menuDriven(sc)) != 0) {
			switch (ch) {
			case 1:
				Comparator<Student> refToCity = new ByCity();
				Arrays.sort(s, refToCity);
				break;
			case 2:
				Comparator<Student> refToMarks = new ByMarks();
				Arrays.sort(s, refToMarks);
				break;
			case 3:
				Comparator<Student> refToName = new ByName();
				Arrays.sort(s, refToName);
				break;
			case 4:
				Arrays.sort(s);
				break;
			default:
				System.err.println("wrong choice...!");
				break;
			}
			displayArray(s);
		}
	}
}
