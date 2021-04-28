package Overloading;

public class Main {

	public static void main(String[] args) {
		Apple objA = new Apple();
		
		objA.name("Apple");
		objA.quantity(10);
		objA.price(2.5);
		objA.weight(100);
		objA.totalprice(10,2.5);
		objA.totalweight(10,100);

	}

}
