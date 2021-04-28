package Exercise;

public class dragonFruit extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	
	public dragonFruit(String name,int q, double p,double w) {
		 super(name);
		 this.quantity = q;
		 this.price= p;
		 this.weight= w;
		
		 System.out.println(name + " constructor is invoked");	 
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
	 public String toString() {
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price;
	}
}
