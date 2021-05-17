package Exercise4point5;

public class Main {

	public static void main(String[] args) {
		//Apple
		System.out.println("=======Apple======");
		Apple A = new Apple("Apple",10,2.6);
		
		
		//GreenApple
		System.out.println("=======Green Apple======");
		Apple GA = new greenApple("Green Apple",50,3,"Light Green","Sour","Australia");
		System.out.println(GA);
		
		//RedApple
		System.out.println("=======Red Apple======");
		redApple RA = new redApple("Red Apple",50,2.8,"Bright Red","Sweet","China");
		System.out.println(RA);
		
		//Mango
		System.out.println("=======Mango======");
		Mango M = new Mango("Mango",10,3.5,150,"Yellow/Orange","Sweet and Sour");
		System.out.println(M);
		
		//Dragon Fruit
		System.out.println("=======Dragon Fruit======");
		dragonFruit DF = new dragonFruit("Dragon Fruit",10,5,450,"Red","Sweet");
		System.out.println(DF);
		
	}

}
