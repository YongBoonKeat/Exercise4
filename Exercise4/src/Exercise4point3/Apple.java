package Exercise4point3;

public class Apple extends Fruit {
	protected int quantity;
	protected double price;
	
	public Apple() {//constructor for sub class
		super();
	}
	
	public Apple(String name, int Q, double P) {//Constructor with argument
		super(name);
		System.out.println(name + " constructor is invoked");
		this.quantity = Q;
		this.price = P;	
	}
	public int getQuantity(){
	    return this.quantity;
	}
	
	public double getPrice(){
	    return this.price;
	}
	//overloading with no parameter
	public double totalprice(){
	    return this.quantity*this.price;
	}
	//overloading with 1 parameter
		public double totalprice(int Q){
		    return Q*this.price;
		}
	//overloading with 2 parameter
		public double totalprice(int Q,double P){
		    return Q*P;
		}
	public String toString() //overriding method
	{
		return "Quantity\t= "+quantity+"\n"+ 
			   "Price\t\t= RM"+price+"\n"+
			   "Total Price \t= RM"+ totalprice();

	}
		
	
}
