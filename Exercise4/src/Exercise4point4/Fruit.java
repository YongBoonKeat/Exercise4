package Exercise4point4;

public class Fruit {
     protected String name;
	
	//no argument
	public Fruit() {//constructor with no argument
		this.name = " ";
	}
	
	public Fruit(String n) {//constructor with argument
		this.name = n;
	}
	public String toString() { //overriding method
		return name + " constructor is invoked";
	}
}
