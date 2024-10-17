import java.util.Scanner;

public final class Employee {
	private String fName;
	private String lName;
	private double salary;
	final static Scanner s = new Scanner(System.in);

	static double yearlySalary(double salary) {
		return salary * 12;
	}

	static double riseTenPercent(double salary) {

		return salary * 12 + salary * 12 * .1;
	}

	static void showError() {
		System.err.println("Salaray should be positive...!");
	}

	static boolean checkSalary(double salary) {
		if (salary < 1) {
			return false;
		}
		return true;
	}

	public Employee() {
		this("", "", 1);
	}

	public Employee(String fName, String lName, double salary) {
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptEmployee() {
		System.out.println("Enter First Name: ");
		fName = s.next();
		System.out.println("Enter Second Name: ");
		lName = s.next();
		System.out.println("Enter Salary: ");
		salary = s.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("First Name: " + fName);
		System.out.println("Second Name: " + lName);
		System.out.println("Salary: " + salary);
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.acceptEmployee();
		if (Employee.checkSalary(e.getSalary())) {
			e.displayEmployee();
			System.out.println("Yearly Salary: " + (Employee.yearlySalary(e.getSalary())));
			System.out.println("Yearly Salary With 10 Percent Increment: " + (Employee.riseTenPercent(e.getSalary())));
		} else {
			Employee.showError();
			e = null;
		}
		Employee e1 = new Employee();
		e1.acceptEmployee();
		if (Employee.checkSalary(e1.getSalary())) {
			e1.displayEmployee();
			System.out.println("Yearly Salary: " + (Employee.yearlySalary(e1.getSalary())));
			System.out.println("Yearly Salary With 10 Percent Increment: " + (Employee.riseTenPercent(e1.getSalary())));
		} else {
			Employee.showError();
			e1 = null;
		}
	}

}
