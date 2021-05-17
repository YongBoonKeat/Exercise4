package Exercise4point5;

public class Apple extends Fruit{
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
			System.out.println("Quantity\t: " + this.quantity + "units");
			System.out.println("Price\t\t: RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
		else if (this.quantity > 10 && this.quantity <= 100) {
			System.out.println(name);
			double pp; // Buy more than 10 but less than 100, price more cheaper
			System.out.println("If quantity MORE than 10, Get More Cheaper Price!");
			if(name == "Apple" || name == "Red Apple" || name == "Green Apple") {
				pp = 2.4; // Buy more than 10 but less than 100, price is 2.4
			}
				
			else if(name == "Mango") {
				pp = 3.2;// Buy more than 10 but less than 100, price is 3.2
			}
				else{
				pp = 4.5;// Buy more than 10 but less than 100, price is 4.5
			}
			totalPrice(pp); //overloading with 1 argument
			System.out.println("Quantity\t: " + this.quantity +  "units");
			System.out.println("Price\t\t: RM" + pp);
			System.out.println("Total price\t: RM" + totalPrice(pp));
		}
		else {
			System.out.println(name);
			double pp;// Buy more than 100, price more cheaper
			double dis;//have discount rate
			System.out.println("If quantity MORE than 100, Get More Cheaper Price and Special Discount!");
			
		if(name == "Apple" || name == "Red Apple" || name == "Green Apple") {
			pp =2.2;//Buy more than 100, price is 2.2
			Discount A = new AppleDiscount();
			System.out.println("Special Discount: " + (A.discountRate()*100)+"%");
			dis = A.discountRate();//Buy more than 100, get discount;
		}
			
		else if(name == "Mango") {
			pp = 3;
			Discount M = new MangoDiscount();
			System.out.println("Special Discount: " + (M.discountRate()*100)+"%");
			dis = M.discountRate();
		}
		
		else{
			pp = 4;
			Discount DF = new DragonFruitDiscount();
			System.out.println("Special Discount: " + (DF.discountRate()*100)+"%");
			dis = DF.discountRate();
		}
			
			totalPrice(pp, dis); //overloading with 2 arguments
			System.out.println("Quantity\t: " + this.quantity + "units");
			System.out.println("Price\t\t: RM" + pp);
			System.out.println("Total price\t: RM" + totalPrice(pp,dis));
			}
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
