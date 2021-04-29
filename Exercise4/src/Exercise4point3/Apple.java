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
	
	public double totalprice(){
	    return this.quantity*this.price;
	}

	public String toString() //overriding method
	{
		return "Quantity = "+quantity+"\n"+"Price = RM"+price+"\n"+"Total Price = RM"+ totalprice();

	}
		
	
}
