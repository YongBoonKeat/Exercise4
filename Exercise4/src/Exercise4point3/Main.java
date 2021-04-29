package Exercise4point3;

public class Main {

	public static void main(String[] args) {
		//Fruit
		System.out.println("======FRUIT=====");
		Fruit objF = new Fruit("Fruit");	

		System.out.println("======APPLE=====");
		//Apple
		Apple objA = new Apple("Apple",10,2.5);
		System.out.println(objA.toString());
		
		System.out.println("======RED APPLE=====");
		//RedApple
		redApple objRA = new redApple("Red Apple",10,2.8,"Red","Sweet");
		objRA.color();
		System.out.println(objRA.toString());
		
		System.out.println("======GREEN APPLE=====");
		//GreenApple
		greenApple objGA = new greenApple("Green Apple",10,3,"Green","Sour");
		objGA.color();
		System.out.println(objGA.toString());
		
		System.out.println("======DRAGON FRUIT=====");
		//dragon Fruit
		dragonFruit objDF = new dragonFruit("Dragon Fruit",15,450);
		System.out.println(objDF.toString()+objDF.totalweight()+"g");
		objDF.taste("Red");

		System.out.println("======Mango=====");
		//Mango
		Mango objM = new Mango("Mango",20,3.5);
		System.out.print(objM.toString() + objM.totalprice(5));
		System.out.println("\nBalance after payment = RM"+objM.Payment(100,5));
		
	}

}
