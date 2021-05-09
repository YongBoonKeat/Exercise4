package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		
		Apple objA = new Apple("Apple",110,2.6);
		System.out.println("==================================");
		
		Apple objGA = new greenApple("Green Apple",110,3,"Light Green","Sour","Australia");
		System.out.println("==================================");
		
		//RedApple
		redApple objRA = new redApple("Red Apple",50,2.8," Bright Red","Sweet","China");
		System.out.println("==================================");
		
		//Mango
		Mango objM = new Mango("Mango",50,3.5);
		System.out.println("==================================");
		
		//Dragon Fruit
		dragonFruit objDF = new dragonFruit("Dragon Fruit",15,450,5);
		objDF.taste("Red");
		
		
	}

}
