package Exercise4point1;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	private double payment;
	
	public Mango(String name,int q, double p,double w,double py) {
		 super(name);
		 this.quantity = q;
		 this.price= p;
		 this.weight= w;
		 this.payment = py;
		 System.out.println(name + " constructor is invoked");	 
	 }	
	public double payment() {
		return payment;
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
		return  payment - totalprice();
	}
	 public String toString() {
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price;
	}
}
