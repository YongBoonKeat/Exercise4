package Overloading;

public class Apple {
	public void name(String name) {
		 System.out.println(name + " constructor is invoked");	 
	 }	
	public void quantity(int q) {
		 System.out.println("Quantity: " + q);
	}
	public void price(double p) {
		 System.out.println("Price: RM" + p);
	}
	public void weight(double w) {
		 System.out.println("Weight: " + w +"g");
	}
	public void totalprice(int q, double p) {
		 System.out.println("Total Price: RM" + q * p);	
	 }	
	public void totalweight(int q, double w) {
		 System.out.println("Total Weight: " + q * w + "g");	
	 }	
}
