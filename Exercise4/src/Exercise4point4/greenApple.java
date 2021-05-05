package Exercise4point4;

public class greenApple extends Apple{
	private String color;
	private String taste;
	
	public greenApple(String name,int Q,double P, String C,String T){
		super(name,Q,P);
		this.color = C;
		this.taste = T;
	}
	
	public String color() {
		return this.color;
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
	public String toString() {
		return "Color of apple is " + color + 
			   "\nTaste of green apple is " + taste;
	}
	
}
