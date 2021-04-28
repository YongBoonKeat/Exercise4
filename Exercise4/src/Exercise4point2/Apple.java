package Exercise4point2;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	
	public Apple() {//Constructor with no argument
		super(); 
		quantity = 0;
		price = 0;

	}
	
	public Apple(String name, int Q, double P) {//Constructor with argument
		super(name);
		quantity = Q;
		price = P;
		
		//Q=10,P=2.5
		setFruit(name,Q,P);//call method //method for overloading
	}
	
	public void setFruit(String name, int Q, double P){ //overloading method
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
	    return quantity;
	}
	public double getPrice(){
	    return price;
	}
	public double totalprice() {
		return quantity * price;
	 }	
	
	public String toString() //overriding method
	{
		return "Quantity="+quantity+"\n"+"Price=RM"+price+"\n"+"Total Price=RM"+totalprice();

	}
		
	
}
