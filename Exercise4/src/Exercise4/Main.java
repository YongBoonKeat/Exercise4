package Exercise4;

public class Main {

	public static void main(String[] args) {
		Television objTelevision = new Television();//input from user use Scanner
		Sony objSony = new Sony("Sony","KD-50X80J",3099,2,10000);//

		System.out.println("==========================================");
		System.out.println("==========Television Information==========");
		System.out.println(objTelevision);
		System.out.println("Total Price of Television: RM" + objTelevision.totalPrice());
		System.out.println();

		System.out.println("========== Sony ==========");
		System.out.println(objSony);
		System.out.println("Total Price After Discount(5%): RM" + objSony.getDiscount());
		System.out.println("Amount of Balance: RM"	+ objSony.balance());
}
}


