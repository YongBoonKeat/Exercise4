package Exercise4point4;

public class greenApple extends Apple{
	private String color;
	private String taste;
	private String country;
	
	public greenApple(String name,int Q,double P, String C,String T,String Country){
		super(name,Q,P);
		this.color = C;
		this.taste = T;
		this.country = Country;
	}
	
	public String color() {
		return this.color;
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
	
	public String country() {
		return this.country;
	}
	public String toString() {
		return "Color of apple is " + color + 
			   "\nTaste of green apple is " + taste +
		       "\nGreen apple import from " + country;
	}
	
}
