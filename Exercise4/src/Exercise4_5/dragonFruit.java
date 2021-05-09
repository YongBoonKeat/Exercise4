package Exercise4_5;

public class dragonFruit extends Fruit implements Discount{
	private int quantity;
	private double weight;
	private double price;
	
	public dragonFruit(String name, int Q, double W,double P) {//Constructor with argument
		super(name);
		this.quantity = Q;
		this.weight = W;
		this.price = P;
		double totalweight = W*Q;
		//System.out.println(name + " constructor is invoked");
		
		if(totalweight <= 2000) {
			totalPrice();//overloading with no arguments because total weight less than 2000 gram/2kg 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight LESS than 2kg, total price is RM" + totalPrice());
		}
		else if(totalweight > 2000 && totalweight <= 5000 ) {
			double pp = 4.5;//total weight more than 2000 gram/2kg, price is 4.5
			totalPrice(pp);//overloading with 1 arguments 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 2kg,Get More Cheaper Price!");
			System.out.println("Price: RM" + pp);
			System.out.println("Total price: RM" + totalPrice(pp));
		}
		else{
			double pp = 4;//total weight more than 5000 gram/5kg, price is 4
			double dis;//total weight more than 5000 gram/5kg, get discount 3%
			dis = discountRate();
			totalPrice(pp,dis);//overloading with 2 arguments 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 5kg, Get More Cheaper Price and Special Discount!");
			System.out.println("Price: RM" + pp);
			System.out.println("Special Discount: " + (dis*100)+"%");
			System.out.println("Total price: RM" + totalPrice(pp,dis));
	}
	}
	public void taste(String C) {
		if ((C == "White")) 
			System.out.println("White flesh of dragon fruit often has a mild taste!");	
		else if ((C == "Red"))
		    System.out.println("Red flesh of dragon fruit often sweeter and juicier!");
		else
			System.out.println("-");
	}
	public double discountRate() {
	      return 0.03; //Discount 3%	
	}
	public double totalWeight() {
		return (this.weight * this.quantity)/1000;
	}
	public double totalPrice() {//overloading method
		return this.price * this.quantity;
	}
	public double totalPrice(double pp) {//overloading method
		return pp * this.quantity;
	}
	public double totalPrice(double pp, double dis) {//overloading method
		return (pp * this.quantity)*(1-dis);
	}
}
