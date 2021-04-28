package Exercise4point2;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	
	public Apple() {//Constructor with no argument
		super(); 
		quantity = 10;
		price = 2.5;

	}
	
	public Apple(String name, int Q, double P) {//Constructor with argument
		super(name);
		quantity = Q;
		price = P;
		
		//Q=10,P=2.5
		setFruit(name,Q,P);//call method //method for overloading
	}
	
	public void setFruit(String name, int Q, double P){ //overloading method
		if (Q == Q)
	          quantity = Q;
	    else 
	    	System.out.println("-");
		if (P == P)
	          price = P;
	    else 
	    	System.out.println("-");
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
