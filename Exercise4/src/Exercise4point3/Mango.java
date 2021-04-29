package Exercise4point3;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	
	public Mango(String name,int Q, double P) {
		super(name);
		System.out.println(name + " constructor is invoked");
		this.quantity = Q;	
		this.price = P;
	}
	
	//overloading method with no parameter
	public double totalprice() {
		return (this.quantity * this.price);		
	}
	
	//overloading method with 1 parameters
		public double totalprice(int D) {
			return (totalprice()-(totalprice()*D/100));
		}
	//overloading method with 1 parameters
		public double Payment(double PY) {
			return PY-totalprice();
		}	
	//overloading method with 2 parameters
		public double Payment(double PY, int D) {
			return PY-(totalprice()-(totalprice()*D/100));
	}
	
	//overriding method
	public String toString() {
		return ("Quantity = "+quantity+"\nPrice = RM"+price+ "\nThe total price is RM ");	
	}
}
