package Exercise4point6;

public class redApple extends Apple{
	private String color;
	private String taste;
	private String place;
	
	
	public redApple(String name,int Q,double P, String C,String T, String place){//Constructor with argument
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
		return "Color\t\t: " + this.color + 
			   "\nTaste of red apple is " + this.taste+
			   "\nRed Apple import from " + this.place;
	}
}
