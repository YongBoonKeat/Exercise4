package Exercise4point2;

public class Fruit {
	private String name;
	
	public Fruit() { 
		name = "Fruit";
	}
	public Fruit(String name) { 
		
		setFruit(name);
	}
	public void setFruit(String N) {
		name = N;
	}
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return name +" constructor is invoked";
	}
}
