package Exercise4;

public class Sony extends Television{
	private double payment;
	
	Sony(String b, String m, double p, int q, double py){
		super(b,m,p,q);
		payment = py;
	}
	
	public double getPayment() {
		return payment;
	}
	
	public double getDiscount() {
		return super.totalPrice() - (super.totalPrice()*5/100);
	}
	
	public double balance() {
		return payment - getDiscount() ;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Amount of Payment= RM " + payment ;
	}
	

}

