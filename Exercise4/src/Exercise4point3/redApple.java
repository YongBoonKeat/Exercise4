package Exercise4point3;

public class redApple extends Apple{
	private String color;
	private String taste;
	
	public redApple(String name,int Q,double P, String C,String T){
		super(name,Q,P);
		this.color = C;
		this.taste = T;
	}
	public void color() {
		if ((this.color == "Green")) 
			System.out.println("This is Green Apple!");	
		else if ((this.color == "Red"))
		    System.out.println("This is Red Apple!");
		else
			System.out.println("-");
	}
	public String taste() {
		return this.taste;
	}
	
	//overriding method
		public double totalPrice() {
			return this.price * this.quantity;
		}
		//overriding method
				public String toString() {
					return  "Quantity = "+quantity+"\n"+"Price = RM"+price+"\n"+"Total Price = RM"+ totalprice()+
							"\nTaste of green apple is " + taste;
		}
}
