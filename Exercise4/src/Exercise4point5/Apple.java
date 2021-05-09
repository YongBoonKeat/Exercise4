package Exercise4point5;

public class Apple extends Fruit implements Discount{
	protected int quantity;
	protected double price;
	
	public Apple(String name,int Q,double P) {//Constructor with argument
		super(name);
		this.quantity = Q;
		this.price = P;	
		//System.out.println(name + " constructor is invoked");
	
		if (this.quantity <= 10) {
			totalPrice(); //overloading with no arguments because price is same 
			System.out.println(name);
			System.out.println("Quantity: " + this.quantity);
			System.out.println("Price: RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
		else if (this.quantity > 10 && this.quantity <= 100) {
			System.out.println(name);
			double pp = 2.4; // Buy more than 10 but less than 100, price is 2.4
			totalPrice(pp); //overloading with 1 argument
			System.out.println("Quantity: " + this.quantity);
			System.out.println("If quantity MORE than 10, Get More Cheaper Price!");
			System.out.println("Price: RM" + pp);
			System.out.println("Total price: RM" + totalPrice(pp));
		}
		else {
			System.out.println(name);
			double pp =2.2; //Buy more than 100, price is 2.2
			double dis;
			dis = discountRate();//Buy more than 100, get discount;
			totalPrice(pp, dis); //overloading with 2 arguments
			System.out.println("Quantity: " + this.quantity);
			System.out.println("If quantity MORE than 100, Get More Cheaper Price and Special Discount!");
			System.out.println("Price: RM" + pp);
			System.out.println("Special Discount: " + (dis*100)+"%");
			System.out.println("Total price: RM" + totalPrice(pp,dis));
			}
	}
	public double discountRate() {
	      return 0.05; //Discount 5%	
	}
	public double totalPrice() {//overloading method
		return this.price * this.quantity;
	}
	public double totalPrice(double pp) {//overloading method
		return pp * this.quantity;
	}
	public double totalPrice(double pp, double dis) {//overloading method
		return pp * this.quantity* (1-dis);
	}
}
