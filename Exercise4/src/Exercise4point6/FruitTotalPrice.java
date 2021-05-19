package Exercise4point6;

class AppleTotalPrice implements TotalPrice{

	public double totalPrice(int Q) { //same method as in Price
		return 2.4 * Q; //with body
		//2.4 is the new price for apple
	}

	public double totalPrice(int Q, double dis) { //same method as in Price
		return 2.2 * Q * (1-dis); //with body
		//2.2 is the new price for apple
	}
}

class MangoTotalPrice implements TotalPrice{

	public double totalPrice(int Q) { //same method as in Price
		return 3.2 * Q; //with body
		//3.2 is the new price for Mango
	}

	public double totalPrice(int Q, double dis) { //same method as in Price
		return 3 * Q * (1-dis); //with body
		//3 is the new price for Mango
	}
}

class DragonFruitTotalPrice implements TotalPrice{

	public double totalPrice(int Q) { //same method as in Price
		return 4.5 * Q; //with body
		//4.5 is the new price for DragonFruit
	}

	public double totalPrice(int Q, double dis) { //same method as in Price
		return 4 * Q * (1-dis); //with body
		//4 is the new price for DragonFruit
	}
}