package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		//Apple
		System.out.println("=======Apple======");
		Apple A = new Apple("Apple",110,2.6);
		
		
		//GreenApple
		System.out.println("=======Green Apple======");
		Apple GA = new greenApple("Green Apple",110,3,"Light Green","Sour","Australia");
		
		//RedApple
		System.out.println("=======Red Apple======");
		redApple RA = new redApple("Red Apple",50,2.8," Bright Red","Sweet","China");
		
		//Mango
		System.out.println("=======Mango======");
		Mango M = new Mango("Mango",50,3.5);
		
		
		//Dragon Fruit
		System.out.println("=======Dragon Fruit======");
		dragonFruit DF = new dragonFruit("Dragon Fruit",15,450,5);
		DF.taste("Red");
		
		
	}

}
