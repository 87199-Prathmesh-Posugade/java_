import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partDes;
	private int quantity;
	private double partPrice;
	//static members can be initialized at time of declaration
	//in reference s not any other objects reference is allowed to store due to final field
	final static Scanner s=new Scanner(System.in);
	
	static {
		//static members can be initialized at static block(it execute only ones by jvm)		
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
	public static double calculateTotalBill(Invoice... i){
		double total=.0;
		for(Invoice o: i) {
			total=total+(o.getPartPrice()*o.getQuantity());
		}
		return total;
	}
	
}

public class Assignment0301 {

	public static void main(String[] args) {
		Invoice i1=new Invoice();
		Invoice i2=new Invoice();
		Invoice i3=new Invoice();
		i1.accept();
		i2.accept();
		i3.accept();
		System.out.println("getPartNumber()"+"\t"+"getPartDes()"+"\t"+"getQuantity()"+"\t"+"getPartPrice()");
		i1.display();
		i2.display();
		i3.display();
		System.out.println("Total Bill: "+Invoice.calculateTotalBill(i1, i2, i3));
	}

}
