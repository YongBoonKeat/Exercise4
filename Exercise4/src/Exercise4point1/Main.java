package Exercise4point1;

public class Main {

	public static void main(String[] args) {
		//System.out.println("=======Fruit=======");
		//Fruit objFruit = new Fruit("Fruit");//Universal
		
		System.out.println("=======Apple=======");
		Apple objApple = new Apple("Apple",10,2.5);
		System.out.println(objApple);
		System.out.println("Total Price: RM" + objApple.totalprice());
		
		System.out.println("=======Red Apple=======");
		redApple objR =new redApple("Red Apple",10,2.8,"Red");
		System.out.println(objR);
		System.out.println("Color of apple: " + objR.color());
		System.out.println("Total price Red Apple : RM"+objR.totalprice());
		
		System.out.println("=======Green Apple=======");
		greenApple objG =new greenApple("Green Apple",10,3,"Green");
		System.out.println(objG);
		System.out.println("Color of apple: " + objG.color());
		System.out.println("Total price Red Apple : RM"+objG.totalprice());
		
		System.out.println("=======Dragon Fruit=======");
		dragonFruit objMDF = new dragonFruit("Dragon Fruit",5,6,600);
		System.out.println(objMDF);
		System.out.println("Total Price: RM" + objMDF.totalprice());
		System.out.println("Total Weight: " + objMDF.totalweight()+ "g");
		System.out.println("Average Weight: " + objMDF.averageweight()+ "g");
		
		System.out.println("=======Mango=======");
		Mango objMango = new Mango("Mango",10,3.5,150,100);
		System.out.println(objMango);
		System.out.println("Total Price: RM" + objMango.totalprice());
		System.out.println("Total Weight: " + objMango.totalweight()+ "g");
		System.out.println("Average Weight: " + objMango.averageweight()+ "g");
		System.out.println("Payment: RM" + objMango.payment());
		System.out.println("Balance: RM" + objMango.balance());
		
		
	}
}
