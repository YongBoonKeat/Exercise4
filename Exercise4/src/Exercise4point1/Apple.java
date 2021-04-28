package Exercise4point1;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	
	public Apple(String name,int q, double p) {
		 super(name);
		 this.quantity = q;
		 this.price= p;
		 System.out.println(name + " constructor is invoked");	 
	 }	
	
	public double totalprice() {
		return this.quantity * this.price;
	}
	 public String toString() {
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price;
		}
}
