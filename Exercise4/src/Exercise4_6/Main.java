package Exercise4_6;

public class Main {

	public static void main(String[] args) {
				//Apple
				Apple A = new Apple("Apple",110,2.6);
				System.out.println("==================================");
				
				//GreenApple
				Apple GA = new greenApple("Green Apple",110,3,"Light Green","Sour","Australia");
				
				System.out.println("==================================");
				
				//RedApple
				redApple RA = new redApple("Red Apple",50,2.8," Bright Red","Sweet","China");
				System.out.println("==================================");
				RA.toString();
				//Mango
				Mango M = new Mango("Mango",105,3.5);
				System.out.println("==================================");
				
				//Dragon Fruit
				dragonFruit DF = new dragonFruit("Dragon Fruit",15,450,5);
				DF.taste("Red");
				

	}

}
