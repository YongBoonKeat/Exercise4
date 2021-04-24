package Exercise4;
import java.util.Scanner;
//Television is super class
public class Television {
	
	private String brand,model;
	private double price;
	private int quantity;
	
	Scanner in = new Scanner(System.in);
	
	public Television() {
		System.out.print("Enter Brand of Television: ");
		this.brand = in.nextLine();
		System.out.print("Enter Model of Television: ");
		this.model = in.nextLine();
		System.out.print("Enter Price of Television: ");
		this.price = in.nextDouble();
		System.out.print("Enter Quantity of Television: ");
		this.quantity=in.nextInt();
	}	
	Television(String b, String m, double p, int q){
		this.brand = b;
		this.model = m;
		this.price = p;
		this.quantity = q;	
	}
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public double getPrice() {
		  return this.price;
	}
	 public double getQuantity() {
		  return this.quantity;
	}
	 public double totalPrice() {
			return this.price * this.quantity;
	}
	 public String toString() {
			return "Brand = "+brand+"\n"+"Model = "+model+"\n"+"Price = RM"+price+"\n"+ "Quantity = "+quantity;
		}
}