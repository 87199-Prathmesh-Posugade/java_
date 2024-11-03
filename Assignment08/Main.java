import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Project> arrList = null;
		HashSet<Project> p = loadProducts();
		int k;
		while ((k = menuDriven(s)) != 9) {
			switch (k) {
			case 1:
				int size = p.size();
				System.out.println("Enter Project Id, Title, Team Size, Project Cost, Technology: ");
				p.add(new Project(s.nextInt(), s.next(), s.nextInt(), s.nextDouble(), s.next()));
				if (p.size() == size)
					System.err.println("Project id exists try with new id.\n");
				else
					System.out.println("Project added successfully...!");
				break;
			case 2:
				System.out.println("******************************************************************************");
				p.forEach(System.out::println);
				System.out.println("******************************************************************************");
				break;
			case 3:
				System.out.println("Enter project id: ");
				if (p.remove(new Project(s.nextInt())))
					System.out.println("Project removed successfully...!");
				else
					System.err.println("Project id does not exists.\n");
				break;
			case 4:
				arrList = p.stream().collect(Collectors.toCollection(ArrayList::new));
				break;
			case 5:
				try {
					System.out
							.println("******************************************************************************");
					arrList.forEach(System.out::println);
					System.out
							.println("******************************************************************************");
				} catch (NullPointerException e) {
					System.out.println("Data not found in an ArrayList :(");
				}
				break;
			case 6:
				if (arrList.isEmpty()) {
					System.out.println("Data not found in an ArrayList :(");
				} else {
					System.out
							.println("******************************************************************************");
					arrList.stream().sorted((o1, o2) -> Double.compare(o2.getProjectCost(), o1.getProjectCost()))
							.forEach(System.out::println);
					System.out
							.println("******************************************************************************");
				}
				break;
			case 7:
				System.out.println("******************************************************************************");
				System.out.println(Collections.max(p, (o1, o2) -> Double.compare(o1.getTeamSize(), o2.getTeamSize())));
				System.out.println("******************************************************************************");
				break;
			case 8:
				System.out.println(
						"Count of Java projects: " + p.stream().filter(e -> e.getTech().equals("Java")).count());
				break;
			default:
				System.err.println("Enter valid choice :(\n");
				break;
			}
		}
		saveProjects(p);
	}

	private static int menuDriven(Scanner s) {
		System.out.println("1. Add Project.");
		System.out.println("2. Display all Projects.");
		System.out.println("3. Delete a Project by Id");
		System.out.println("4. Copy all Projects from Set to ArrayList");
		System.out.println("5. Display all Projects from List");
		System.out.println("6. Sort all Projects in List by cost");
		System.out.println("7. Find project with Max team size using Collections.max()");
		System.out.println("8. Count all Projects of \"Java\" technology using Stream API");
		System.out.println("9. Exit");
		System.out.print(":) Enter choice: ");
		return s.nextInt();
	}

	private static HashSet<Project> loadProducts() {
		try (FileInputStream f = new FileInputStream("ProjectInfo.db")) {
			try (BufferedInputStream b = new BufferedInputStream(f)) {
				try (ObjectInputStream o = new ObjectInputStream(b)) {
					try {
						return (HashSet<Project>) o.readObject();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HashSet<Project>();
	}

	private static void saveProjects(HashSet<Project> p) {
		try (FileOutputStream f = new FileOutputStream("ProjectInfo.db")) {
			try (BufferedOutputStream b = new BufferedOutputStream(f)) {
				try (ObjectOutputStream o = new ObjectOutputStream(b)) {
					o.writeObject(p);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
