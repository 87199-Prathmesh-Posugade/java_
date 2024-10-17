import java.util.Scanner;

public class Invoice {
	static double totalBill;
	private String partNumber;
	private String partDes;
	private int quantity;
	private double partPrice;
	//static members can be initialized at time of declaration
	//in reference s not any other objects reference is allowed to store due to final field
	final static Scanner s=new Scanner(System.in);
	//static members can be initialized at static block(it execute only ones by jvm)
	static {
		totalBill=.0;
	}
	
	public Invoice() {
		this("1", "undefined", 0, .0);
	}
	public Invoice(String partNumber, String partDes, int quantity, double partPrice) {
		this.partDes=partDes;
		this.partNumber=partNumber;
		if(quantity<0) {
			this.quantity=0;			
		}
		else {			
			this.quantity=quantity;
		}
		if(partPrice<0) {
			this.partPrice=.0;			
		}
		else {			
			this.partPrice=partPrice;
		}
	}
	
	public void setPartDes(String partDes) {
		this.partDes = partDes;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPartDes() {
		return partDes;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public double getPartPrice() {
		return partPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void accept() {
		double n;
		System.out.println("Enter part number: ");
		setPartNumber(s.next());
		System.out.println("Enter part description: ");
		setPartDes(s.next());
		System.out.println("Enter part quantity: ");
		n=s.nextInt();
		if(n<0) {
			setQuantity(0);
		}
		else {
			setQuantity((int)n);
		}
		System.out.println("Enter part price: ");
		n=s.nextDouble();
		if(n<0) {
			setPartPrice(.0);
		}
		else {
			setPartPrice(n);			
		}		
	}
	public void display() {
		System.out.println(getPartNumber()+"\t\t"+getPartDes()+"\t\t"+getQuantity()+"\t\t"+getPartPrice());
	}
}


public class Assignment0301 {

	public static void main(String[] args) {
		Invoice i1=new Invoice();
		Invoice i2=new Invoice();
		i1.accept();
		i2.accept();
		System.out.println("getPartNumber()"+"\t"+"getPartDes()"+"\t"+"getQuantity()"+"\t"+"getPartPrice()");
		i1.display();
		i2.display();
		Invoice.totalBill=(i1.getPartPrice()*i1.getQuantity())+(i2.getPartPrice()*i2.getQuantity());
		System.out.println("Total Bill: "+Invoice.totalBill);
	}

}
