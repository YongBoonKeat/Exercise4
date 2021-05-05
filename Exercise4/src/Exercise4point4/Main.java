package Exercise4point4;

public class Main {

	public static void main(String[] args) {
		//Fruit
		//System.out.println("========FRUIT=======");
		//Fruit objF = new Fruit("Fruit");
		//System.out.println(objF.toString());
		
		//Apple
		System.out.println("========APPLE=======");
		Apple objA = new Apple("Apple",5,2.6);
		
		//RedApple
		System.out.println("========RED APPLE=======");
		redApple objRA = new redApple("Red Apple",50,2.8,"Red","Sweet");
		System.out.println(objRA);
		
		//GreenApple
		System.out.println("========GREEN APPLE=======");
		greenApple objGA = new greenApple("Green Apple",120,3,"Light Green","Sour");
		System.out.println(objGA);
		
		//Dragon Fruit
		System.out.println("========DRAGON FRUIT=======");
		dragonFruit objDF = new dragonFruit("Dragon Fruit",10,450,5);
		objDF.taste("Red");
		
		//Mango
		System.out.println("========MANGO=======");
		Mango objM = new Mango("Mango",30,3.5,10,200);
	
	}

}
