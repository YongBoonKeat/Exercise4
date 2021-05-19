package Exercise4point6;

public abstract class Fruit {
	//Define super class as abstract class.
		protected String name;
		
		 public Fruit(String name) {//constructor with argument
			this.name = name;
			System.out.println(name + " constructor is invoked");
		}
}
