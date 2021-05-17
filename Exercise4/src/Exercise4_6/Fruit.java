package Exercise4_6;

public abstract class Fruit {
	//Define super class as abstract class.
		protected String name;
		
		 public Fruit(String name) {//constructor with argument
			this.name = name;
			System.out.println(name + " constructor is invoked");
		}
		 
	//abstract method
	public abstract double totalPrice();
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(double pp, double qq);
}
