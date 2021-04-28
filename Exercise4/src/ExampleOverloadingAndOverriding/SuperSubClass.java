package ExampleOverloadingAndOverriding;

public class SuperSubClass {

	public static void main(String[] args) {
		RectangleShape rectangle = new RectangleShape(12, 4);
		System.out.println("Rectangle\n"+ rectangle); //print using overriding method
		
		BoxShape box = new BoxShape(13, 7, 2);
		System.out.println("Box \n" + box);		//print using overriding method
	
	}

}
