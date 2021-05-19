package Exercise4point6;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	
	public Apple(String name,int Q,double P) {//Constructor with argument
		super(name);
		this.quantity = Q;
		this.price = P;	
		//System.out.println(name + " constructor is invoked");
		
		System.out.println(name);
		TotalPrice tpA = new AppleTotalPrice(); 
		TotalPrice tpM = new MangoTotalPrice();
		TotalPrice tpDF= new DragonFruitTotalPrice();
		
		if (this.quantity <= 10) {
			System.out.println("Quantity\t: " + this.quantity + "units");
			System.out.println("Price\t\t: RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + tpA.totalPrice(Q));
		
		}
		else if (this.quantity > 10 && this.quantity <= 100) {
			// Buy more than 10 but less than 100, price more cheaper
			System.out.println("If quantity MORE than 10, Get More Cheaper Price!");
				if(name == "Apple" || name == "Green Apple" || name == "Red Apple" ) {
					double pA = 2.4;
					System.out.println("Quantity\t: " + Q +  "units");
					System.out.println("Price\t\t: RM" + pA);
					System.out.println("Total price\t: RM" + tpA.totalPrice(Q));
					}
				else if(name == "Mango") {
					double pM = 3.2;
					System.out.println("Quantity\t: " + Q +  "units");
					System.out.println("Price\t\t: RM" + pM);
					System.out.println("Total price\t: RM" + tpM.totalPrice(Q));
						}
				else{
					double pDF = 4.5;// Buy more than 10 but less than 100, price is 4.5
					System.out.println("Quantity\t: " + Q +  "units");
					System.out.println("Price\t\t: RM" + pDF);
					System.out.println("Total price\t: RM" + tpDF.totalPrice(Q));		
				}
		}
		else {
			double pp;// Buy more than 100, price more cheaper
			double dis;//have discount rate
			System.out.println("If quantity MORE than 100, Get More Cheaper Price and Special Discount!");
			
				if(name == "Apple" || name == "Red Apple" || name == "Green Apple") {
							double pA = 2.2;//Buy more than 100, price is 2.2
							Discount dA = new AppleDiscount();
							dis = dA.discountRate();//Buy more than 100, get discount;
							System.out.println("Quantity\t: " + this.quantity + "units");
							System.out.println("Price\t\t: RM" + pA);
							System.out.println("Special Discount: " + (dA.discountRate()*100)+"%");
							System.out.println("Total price\t: RM" + tpA.totalPrice(Q,dis));
							}
				else if(name == "Mango") {
							double pM = 3;
							Discount dM = new MangoDiscount();	
							dis = dM.discountRate();
							System.out.println("Quantity\t: " + this.quantity + "units");
							System.out.println("Price\t\t: RM" + pM);
							System.out.println("Special Discount: " + (dM.discountRate()*100)+"%");
							System.out.println("Total price\t: RM" + tpM.totalPrice(Q,dis));
							}
				else{
							double pDF = 4;
							Discount dDF = new DragonFruitDiscount();
							dis = dDF.discountRate();
							System.out.println("Quantity\t: " + this.quantity + "units");
							System.out.println("Price\t\t: RM" + pDF);
							System.out.println("Special Discount: " + (dDF.discountRate()*100)+"%");
							System.out.println("Total price\t: RM" + tpDF.totalPrice(Q,dis));
							}
			}
	}
}
