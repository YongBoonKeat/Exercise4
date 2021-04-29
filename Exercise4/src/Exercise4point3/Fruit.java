package Exercise4point3;

public class Fruit {
     protected String name;
	
	//no argument
	public Fruit() {//constructor with no argument
		this.name = " ";
	}
	
	public Fruit(String n) {//constructor with argument
		this.name = n;
		System.out.println("Fruit constructor is invoked");
	}
}
