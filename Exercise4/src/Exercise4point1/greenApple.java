package Exercise4point1;

public class greenApple extends Apple  {
	private String color;
	
	public greenApple (String name,int q, double p,String c) {
		super(name,q,p);
		this.color=c;
	}
	public String color() {
		return this.color;
	}
	public double totalprice() {
		return super.quantity * super.price;
	}
	 public String toString() {
			return "Quantity= "+ quantity + "\n" +"Price= RM" + price;
	}
}
