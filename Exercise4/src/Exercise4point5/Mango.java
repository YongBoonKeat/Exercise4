package Exercise4point5;

public class Mango extends Apple{
	private double weight;
	private String color;
	private String taste;
	
	public Mango(String name,int Q,double P,double W,String C,String T) {//Constructor with argument
		super(name,Q,P);
		this.weight = W;
		this.color = C;
		this.taste = T;
		//System.out.println(name + " constructor is invoked");
	
	/*	if (this.quantity <= 10) {
			totalPrice(); //overloading with no arguments because price is same 
			System.out.println(name);
			System.out.println("Quantity\t: " + this.quantity);
			System.out.println("Price\t: RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
		else if (this.quantity > 10 && this.quantity <= 100) {
			System.out.println(name);
			double pp = 3.2; // Buy more than 10 but less than 100, price is RM3.2
			totalPrice(pp); //overloading with 1 argument
			System.out.println("Quantity\t: " + this.quantity);
			System.out.println("If quantity MORE than 10, Get More Cheaper Price!");
			System.out.println("Price\t\t: RM" + pp);
			System.out.println("Total price\t: RM" + totalPrice(pp));
		}
		else {
			System.out.println(name);
			double pp = 3; //Buy more than 100, price is RM3
			double dis;
			Discount M = new MangoDiscount();
			dis = M.discountRate();//Buy more than 100, get discount;
			totalPrice(pp, dis); //overloading with 2 arguments
			System.out.println("Quantity\t: " + this.quantity);
			System.out.println("If quantity MORE than 100, Get More Cheaper Price and Special Discount!");
			System.out.println("Price\t\t: RM" + pp);
			System.out.println("Special Discount: " + (dis*100)+"%");
			System.out.println("Total price\t: RM" + totalPrice(pp,dis));
			}*/
	}
	
	public double totalPrice() {//overloading method
		return this.price * this.quantity;
	}
	public double totalPrice(double pp) {//overloading method
		return pp * this.quantity;
	}
	public double totalPrice(double pp, double dis) {//overloading method
		return pp * this.quantity* (1-dis);
	}
	public int Quantity(){
        return quantity;
    }
    
    public double Price(){
        return price;
    }
    
    public double Weight(){
        return weight;
    }
    
	public String Color(){
	        return color;
	}
	
	public String Taste(){
	        return taste;
	}
	
	public double totalWeight() {
		double totalWeight = (quantity*weight)/1000;
        return totalWeight;
	}
	
	 public String toString(){ //overriding method
	       	return	"Weight\t\t: "+Weight()+"g"
	       			+"\nTotal Weight\t: "+totalWeight()+"kg"
	                +"\nColor\t\t: "+Color()
	        		+"\nTaste of dragon fruit is "+Taste();
	    }
	 
}

