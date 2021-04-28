package Exercise4point2;

public class dragonFruit extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	
	public dragonFruit() {//Constructor with no argument
		super(); 
		quantity = 5;
		price = 6;
		weight = 600;

	}
	public dragonFruit(String name,int Q, double P,double W) {//Constructor with argument
		 super();
		 quantity = Q;
		 price= P;
		 weight= W;
		 
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
	public double totalprice() {
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
