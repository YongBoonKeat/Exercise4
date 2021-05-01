package Exercise4point3;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double payment;
	
	public Mango(String name,int Q, double P,double PY) {
		super(name);
		System.out.println(name + " constructor is invoked");
		this.quantity = Q;	
		this.price = P;
		this.payment = PY;
	}
	
	//overloading method with no parameter
	public double totalprice() {
		return (this.quantity * this.price);		
	}
	//overloading method with 1 parameters
		public double totalprice(int D) {
			return (totalprice()-(totalprice()*D/100));
		}

	//overloading method with 0 parameters
		public double Payment() {
					return payment;
		}	
	//overloading method with 1 parameters
		public double Payment(double PY) {
			return PY-totalprice();
		}	
	//overloading method with 2 parameters
		public double Payment(double PY,int D) {
			return PY-(totalprice()-(totalprice()*D/100));
	}
	
	//overriding method
	public String toString() {
		return ("Quantity \t\t\t\t= "+quantity+
				"\nPrice \t\t\t\t\t= RM"+price+ 
				"\nAmmount payment \t\t\t= RM" + Payment()+
				"\nTotal price(No Discount)\t\t= RM"+ totalprice()+ 
				"\nBalance after payment(No Discount)\t= RM"+ Payment(100)+
				"\nTotal price(Discount)\t\t\t= RM" + totalprice(5) +
				"\nBalance after payment(Discount)\t\t= RM"+ Payment(100,5)
				);	
	}
}
