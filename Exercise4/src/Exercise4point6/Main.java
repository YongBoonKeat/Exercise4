package Exercise4point6;

public class Main {

	public static void main(String[] args) {
		//Apple
		System.out.println("=======Apple======");
		Apple A = new Apple("Apple",110,2.6);
		
		
		//GreenApple
		System.out.println("=======Green Apple======");
		Apple GA = new greenApple("Green Apple",50,3,"Light Green","Sour","Australia");
		System.out.println(GA);
		
		//RedApple
		System.out.println("=======Red Apple======");
		redApple RA = new redApple("Red Apple",110,2.8,"Bright Red","Sweet","China");
		System.out.println(RA);
		
		//Mango
		System.out.println("=======Mango======");
		Mango M = new Mango("Mango",110,3.5,150,"Yellow/Orange","Sweet and Sour");
		System.out.println(M);
		
		//Dragon Fruit
		System.out.println("=======Dragon Fruit======");
		dragonFruit DF = new dragonFruit("Dragon Fruit",110,5,450,"Red","Sweet");
		System.out.println(DF);
		
	}

}
