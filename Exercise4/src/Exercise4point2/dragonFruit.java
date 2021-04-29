package Exercise4point2;

public class dragonFruit extends Fruit{
	private int quantity;
	private double price;
	private double weight;
	
	public dragonFruit() {//Constructor with no argument
		super(); 
	}
	public dragonFruit(String name,int Q, double P,double W) {//Constructor with argument
		 super(name);
		 this.quantity = Q;
		 this.price= P;
		 this.weight= W;
		
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
