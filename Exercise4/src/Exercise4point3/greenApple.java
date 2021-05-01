package Exercise4point3;

public class greenApple extends Apple{
	private String color;
	private String taste;
	private double weight;
	
	public greenApple(String name,int Q,double P, String C,String T,double W){
		super(name,Q,P);
		this.color = C;
		this.taste = T;
		this.weight = W;
	}
	
	public void color() {
		if (this.color == "Green") 
			System.out.println("This is Green Apple!");	
		else if (this.color == "Red")
		    System.out.println("This is Red Apple!");
		else
			System.out.println("-");
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
	//overloading with no parameter
			public double totalweight(){
			    return quantity * this.weight;
	}
	//overloading with 1 parameter
				public double totalweight(int Q){
				    return Q*this.weight;
	}
	//overloading with 2 parameter
				public double totalweight(int Q,double P){
				    return Q*P;
	}
		
	//overriding method
		public String toString() {
			return  "Quantity\t= " + quantity + 
					"\nPrice \t\t= RM"+ price+ 
					"\nTotal Price \t= RM" + totalprice()+
					"\nTotal weight \t= " + totalweight() +
					"g\nTaste of green apple is " + taste;
		}
}
