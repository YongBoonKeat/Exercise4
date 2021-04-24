package Exercise;

public class redApple extends Apple  {
	private String color;
	
	public redApple (String name,int q, double p,String c) {
		super(name,q,p);
		this.color=c;
	}
	public String color() {
		return this.color;
	}
	public double totalprice() {
		return super.quantity * super.price;
	}
	
}

