package Exercise4point2;

public class Main {

	public static void main(String[] args) {
		//Fruit F= new Fruit("Fruit");
		//System.out.println("Fruit\n"+ F);
		//System.out.println("==============================");
		
		//Apple
		Apple objA = new Apple("Apple",10,2.5);
		System.out.println("Apple\n"+ objA);
		System.out.println("==============================");
		//RedApple
		redApple objRA = new redApple("Apple",10,2.8,"Red","Sweet");
		System.out.println("Red Apple\n"+ objRA);
		//GreenApple
		System.out.println("==============================");
		greenApple objGA = new greenApple("Apple",10,3,"Green","Sour");
		System.out.println("Green Apple\n"+ objGA);
		//Dragon Fruit
		System.out.println("==============================");
		dragonFruit objDF = new dragonFruit("Dragon Fruit",5,6,600);
		System.out.println("Dragon Fruit\n"+ objDF);
		//Mango
		System.out.println("==============================");
		Mango objM = new Mango("Mango",10,3.5,150,100);
		System.out.println("Mango\n"+ objM);
		
	}
}
