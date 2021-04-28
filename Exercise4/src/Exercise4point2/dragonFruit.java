package Exercise4point2;

public class dragonFruit extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	
	public dragonFruit() {//Constructor with no argument
		super(); 
		quantity = 0;
		price = 0;
		weight = 0;

	}
	public dragonFruit(String name,int Q, double P,double W) {//Constructor with argument
		 super();
		 quantity = Q;
		 price= P;
		 weight= W;
		 
		 setFruit(name,Q,P,W);//call method //method for overloading
	}
	public void setFruit(String name, int Q, double P,double W){ //overloading method
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
   } 
	public double  totalprice() {
		return this.quantity * this.price;
	}
	public double totalweight() {
		return this.quantity * this.weight;
	}
	public double averageweight() {
		return  totalweight() / this.quantity;
	}
	 public String toString() {
			return "Quantity= "+ quantity+"\nPrice= RM"+price+"\nTotal Price=RM"+totalprice()
			+"\nTotal Weight= "+totalweight()+"g\n"+"Average Weight= "+averageweight()+"g";
	}
}
