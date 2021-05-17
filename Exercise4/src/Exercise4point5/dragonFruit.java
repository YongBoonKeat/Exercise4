package Exercise4point5;

public class dragonFruit extends Apple{
	private double weight;
	private String color;
	private String taste;
	
	public dragonFruit(String name, int Q,double P, double W,String C,String T) {//Constructor with argument
		super(name,Q,P);
		this.weight = W;
		this.color = C;
		this.taste = T;
		//System.out.println(name + " constructor is invoked");
		
		/*if(totalweight <= 2000) {
			totalPrice();//overloading with no arguments because total weight less than 2000 gram/2kg 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight LESS than 2kg, total price is RM" + totalPrice());
		}
		else if(totalweight > 2000 && totalweight <= 5000 ) {
			double pp = 4.5;//total weight more than 2000 gram/2kg, price is 4.5
			totalPrice(pp);//overloading with 1 arguments 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 2kg,Get More Cheaper Price!");
			System.out.println("Price\t\t: RM" + pp);
			System.out.println("Total price\t: RM" + totalPrice(pp));
		}
		else{
			double pp = 4;//total weight more than 5000 gram/5kg, price is 4
			double dis;//total weight more than 5000 gram/5kg, get discount 3%
			Discount DF = new DragonFruitDiscount();
			dis = DF.discountRate();
			totalPrice(pp,dis);//overloading with 2 arguments 
			System.out.println(name);
			System.out.println("Total Weight(KG): " + totalWeight() + "kg");
			System.out.println("If total weight MORE than 5kg, Get More Cheaper Price and Special Discount!");
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
		return (pp * this.quantity)*(1-dis);
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
