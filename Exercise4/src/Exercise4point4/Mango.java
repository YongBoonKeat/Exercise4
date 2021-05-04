package Exercise4point4;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double shippingFee;
	private double payment;
	
	public Mango(String name,int Q, double P,double SF,double PY) {
		super(name);
		this.quantity = Q;	
		this.price = P;
		this.shippingFee = SF;
		this.payment = PY;
		double totalprice = Q*P;
		//System.out.println(name + " constructor is invoked");
	
	if (totalprice < 50) {
		System.out.println(name);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend LESS than RM50, total payment amount is RM" + Payment());
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + (this.payment-Payment()));
	}
	else if (totalprice > 50 && totalprice < 100) {
		int dis = 2; 
		Payment(dis);
		System.out.println(name);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend MORE than RM50, total payment amount is RM" + Payment(dis));
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + (this.payment-Payment(dis)));
	}
	else {
		double s = 0;
		int dis = 5; 
		Payment(s, dis);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend MORE than RM100, total payment amount is RM" + Payment(s, dis));
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + (this.payment-Payment(s,dis)));
		}
	}
	public double totalPrice() {
		return this.price * this.quantity;
	}
	public double Payment() {
		return this.shippingFee+totalPrice();
	}	
	public double Payment(int dis) {
		return this.shippingFee+(totalPrice()-(totalPrice()*dis/100));
	}
	public double Payment(double s,int dis) {
		return s+(totalPrice()-(totalPrice()*dis/100));
    }
}
