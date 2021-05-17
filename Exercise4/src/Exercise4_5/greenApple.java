package Exercise4_5;

public class greenApple extends Apple {
	private String color;
	private String taste;
	private String place;
	
	
	public greenApple(String name,int Q,double P, String C,String T, String place){//Constructor with argument
		super(name,Q,P);
		this.color = C;
		this.taste = T;
		this.place = place;
	}

	public String Place(){
		return this.place;
	}
	public String Color(){
		return this.color;
	}
	public String Taste(){
		return this.taste;
	}
	public String toString() {
		return "Color of apple is " + this.color + 
			   "\nTaste of green apple is " + this.taste+
			   "\nGreen Apple import from " + this.place;
	}
}
