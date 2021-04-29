package Exercise4point2;

public class Fruit {
	protected String name;
	
	public Fruit() { 
		this.name = " ";
	}
	public Fruit(String name) { //overloading method
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}
	
	public String toString() { //overriding method
		return "Name: " + name;
	}
}
