package Exercise4point3;

public class dragonFruit extends Fruit{
	private int quantity;
	private double weight;
	
	public dragonFruit(String name, int Q, double W) {//Constructor with argument
		super(name);
		System.out.println(name + " constructor is invoked");
		this.quantity = Q;
		this.weight = W;	
	}
	public void taste(String C) {
		if ((C == "White")) 
			System.out.println("White flesh of dragon fruit often has a mild taste!");	
		else if ((C == "Red"))
		    System.out.println("Red flesh of dragon fruit often sweeter and juicier!");
		else
			System.out.println("-");
	}
	
	//overloading with no parameter
		public double totalweight() {
			return (this.quantity * this.weight);
		}
		
	//overloading with 1 parameter
		public double totalweight(double W) {
			return (this.quantity * W);
		}
		public double totalweight(int Q) {
			return (Q * this.weight);
		}
		
	//overriding method
		public String toString() {
			return ("Quantity = "+quantity+"\n"+ "Weight = "+ weight + "\nTotal Weight = ");
		}
}
