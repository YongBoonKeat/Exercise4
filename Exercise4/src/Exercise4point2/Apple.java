package Exercise4point2;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	
	public Apple() {//Constructor with no argument
		super(); 
		this.quantity = 0;
		this.price = 0;

	}
	
	public Apple(String N, int Q, double P) {//Constructor with argument
		super(N);
		this.quantity = Q;
		this.price = P;
		
		//Q=10,P=2.5
		setFruit(N,Q,P);//call method //method for overloading
	}
	
	public void setFruit(String N, int Q, double P){ //overloading method
		if (Q >= 0)
	          quantity = Q;
	    else 
	    	quantity = 0;
		
		if (P >= 0)
	          price = P;
	    else 
	    	price = 0;
	   } 

	public double getQuantity(){
	    return this.quantity;
	}
	public double getPrice(){
	    return this.price;
	}
	public double totalprice() {
		return this.quantity * price;
	 }	
	
	public String toString() //overriding method
	{
		return "Quantity="+quantity+"\n"+"Price=RM"+price+"\n"+"Total Price=RM"+totalprice();

	}
		
	
}
