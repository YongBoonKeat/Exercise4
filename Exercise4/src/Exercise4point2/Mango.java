package Exercise4point2;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	private double payment;
	
	public Mango() {//Constructor with no argument
		super(); 

	}
	public Mango(String name, int Q, double P,double W,double PY) {//Constructor with argument
		super(name);
		this.quantity = Q;
		this.price = P;
		this.weight = W;
		this.payment= PY;
		
	}

	public double payment() {
		return this.payment;
	}
	public double totalprice() {
		return this.quantity * this.price;
	}
	public double totalweight() {
		return this.quantity * this.weight;
	}
	public double averageweight() {
		return  totalweight() / this.quantity;
	}
	public double balance() {
		return  this.payment - totalprice();
	}
	 public String toString() {
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price+"\n"+"Total Price=RM"+totalprice()
			+"\n"+"Total Weight= "+totalweight()+"g\n"+"Average Weight= "+averageweight()+"g\n"+"Payment=RM"+payment
			+"\n"+"Balance=RM"+balance();
	}
}
