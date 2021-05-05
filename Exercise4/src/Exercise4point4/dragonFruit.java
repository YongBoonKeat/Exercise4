package Exercise4point4;

public class dragonFruit extends Fruit{
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
			totalPrice();
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight LESS than 2kg, total price is RM" + totalPrice());
		}
		else if(totalweight >= 2000 && totalweight <= 5000 ) {
			double pp = 4.5;
			totalPrice(pp);
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 2kg, More Cheaper Price!");
			System.out.println("Total price: RM" + totalPrice(pp));
		}
		else if(totalweight >= 5000 ) {
			double pp = 4;
			int dis = 3;
			totalPrice(pp,dis);
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 5kg, Get Special Discount!");
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
	public double totalWeight() {
		return (this.weight * this.quantity)/1000;
	}
	public double totalPrice() {
		return this.price * this.quantity;
	}
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	public double totalPrice(double pp, double dis) {
		return (pp * this.quantity)-((pp * this.quantity)*dis/100);
	}
}
