package Exercise4point2;

public class Mango extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	private double payment;
	
	public Mango() {//Constructor with no argument
		super(); 
		quantity = 0;
		price = 0;
		weight = 0;
		payment= 0;

	}
	public Mango(String name, int Q, double P,double W,double PY) {//Constructor with argument
		super(name);
		quantity = Q;
		price = P;
		weight = W;
		payment= PY;
		
		setFruit(name,Q,P,W,PY);//call method //method for overloading
	}
	public void setFruit(String name, int Q, double P,double W,double PY){ //overloading method
		if (Q >= 0)
	          quantity = Q;
	    else 
	    	quantity = 0;
		
		if (P >= 0)
	          price = P;
	    else 
	    	price = 0;
		
		if (W >= 0)
	          weight = W;
	    else 
	    	 weight = 0;
		
		if (PY >= 0)
	          payment = PY;
	    else 
	    	 payment = 0;

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
