package Exercise4point2;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	private double payment;
	
	public Mango() {//Constructor with no argument
		super(); 
		quantity = 10;
		price = 3.5;
		weight = 150;
		payment= 100;

	}
	public Mango(String name, int Q, double P,double W,double PY) {//Constructor with argument
		super(name);
		quantity = Q;
		price = P;
		weight = W;
		payment= PY;
		
		setFruit(name,Q,P,W);//call method //method for overloading
	}
	public void setFruit(String name, int Q, double P,double W){ //overloading method
		if (Q == Q)
	          quantity = Q;
	    else 
	    	System.out.println("-");
		if (P == P)
	          price = P;
	    else 
	    	System.out.println("-");
		if (W == W)
	          weight = W;
	    else 
	    	System.out.println("-");

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
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price+"\n"+"Total Price=RM"+totalprice()
			+"\n"+"Total Weight= "+totalweight()+"g\n"+"Average Weight= "+averageweight()+"g\n"+"Payment=RM"+payment
			+"\n"+"Balance=RM"+balance();
	}
}
