package Exercise4_5;

class AppleDiscount implements Discount{
		public double discountRate() {
			return 0.05;//5% discount
		}
	}

class DragonFruitDiscount implements Discount{
		public double discountRate() {
			return 0.02;//2% discount
		}
	}

class MangoDiscount implements Discount{
	public double discountRate() {
		return 0.03;//3% discount
	}
}