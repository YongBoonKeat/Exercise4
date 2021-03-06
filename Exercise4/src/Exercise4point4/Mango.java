package Exercise4point4;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double shippingFee;
	private double payment;
	
	public Mango(String name,int Q, double P,double SF,double PY) {//Constructor with argument
		super(name);
		this.quantity = Q;	
		this.price = P;
		this.shippingFee = SF;
		this.payment = PY;
		double totalprice = Q*P;
		//System.out.println(name + " constructor is invoked");
	
	if (totalprice < 50) {
		Payment();//overloading with no arguments 
		Balance();//overloading with no arguments 
		System.out.println(name);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend LESS than RM50, Total amount need to payment: RM" + Payment());
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + Balance());
	}
	else if (totalprice > 50 && totalprice < 100) {
		int dis = 2; //spend more than RM50, get discount 2%
		Payment(dis);//overloading with 1 arguments 
		Balance(dis);//overloading with 1 arguments 
		System.out.println(name);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend MORE than RM50, Get Special Discount!");
		System.out.println("Total amount need to payment: RM" + Payment(dis));
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + Balance(dis));
	}
	else{
		double s = 0;//spend more than RM100, free shipping fee
		int dis = 5; //spend more than RM100, get discount 5%
		Payment(s, dis);//overloading with 2 arguments 
		Balance(s,dis);//overloading with 2 arguments 
		System.out.println(name);
		System.out.println("Quantity="+Q+"\nPrice=RM"+P+"\nTotal Price=RM"+totalprice);
		System.out.println("If you spend MORE than RM100, Get Special Discount and Free Shipping Fee!");
		System.out.println("Total amount need to payment: RM" + Payment(s, dis));
		System.out.println("Payment: RM" + this.payment);
		System.out.println("Balance after Payment: RM" + Balance(s,dis));
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
	public double Balance() {
		return this.payment-(this.shippingFee+totalPrice());
	}	
	public double Balance(int dis) {
		return this.payment-(this.shippingFee+(totalPrice()-(totalPrice()*dis/100)));
	}
	public double Balance(double s,int dis) {
		return this.payment-(s+(totalPrice()-(totalPrice()*dis/100)));
    }
}
