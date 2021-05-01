package Exercise4point3;

public class Main {

	public static void main(String[] args) {
		//Fruit
		System.out.println("========FRUIT=======");
		Fruit objF = new Fruit("Fruit");
		System.out.println(objF.toString());
		
		//Apple
		System.out.println("========APPLE=======");
		Apple objA = new Apple("Apple",10,2.5);
		System.out.println(objA.toString());
		
		//RedApple
		System.out.println("========RED APPLE=======");
		redApple objRA = new redApple("Red Apple",10,2.8,"Red","Sweet",90);
		objRA.color();
		System.out.println(objRA.toString());
		
		//GreenApple
		System.out.println("========GREEN APPLE=======");
		greenApple objGA = new greenApple("Green Apple",12,3,"Green","Sour",70);
		objGA.color();
		System.out.println(objGA.toString());
		
		//Dragon Fruit
		System.out.println("========DRAGON FRUIT=======");
		dragonFruit objDF = new dragonFruit("Dragon Fruit",5,450);
		System.out.println(objDF.toString());
		objDF.taste("Red");

		//Mango
		System.out.println("========Mango=======");
		Mango objM = new Mango("Mango",20,3.5,100);
		System.out.print(objM.toString());
	}

}
