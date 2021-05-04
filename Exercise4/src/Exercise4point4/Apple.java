package Exercise4point4;

public class Apple extends Fruit {
	protected int quantity;
	protected double price;
	
	public Apple(String name, int Q, double P) {//Constructor with argument
		super(name);
		this.quantity = Q;
		this.price = P;	
		//System.out.println(name + " constructor is invoked");
		
		if (this.quantity < 10) {
			totalPrice(); //overloading with no arguments because price is same 
			System.out.println(name);
			System.out.println("Quantity = " + this.quantity);
			System.out.println("Price = RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 2.4; // Buy more than 10 but less than 100, price is 2.2
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("Quantity = " + this.quantity);
			System.out.println("Price = RM" + pp);
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
		}
		else {
			double pp = 2.2; //Buy more than 100, price is 2.2
			double dis = 5; //Buy more than 100, discount RM5
			totalPrice(pp, dis); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("Quantity = " + this.quantity);
			System.out.println("Price = RM" + pp);
			System.out.println("Discount = RM" + dis);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(pp,dis));
			}
		}
		    
	public double totalPrice() {
		return this.price * this.quantity;
	}
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	public double totalPrice(double pp, double dis) {
		return (pp * this.quantity) - dis;
	}
}
