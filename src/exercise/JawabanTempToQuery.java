package exercise;

import exercise.TempToQuery.Product;

public class JawabanTempToQuery {
	class Product {
		private int quantity;
		private int itemPrice;

		public Product(int quantity, int price) {
			this.quantity = quantity;
			this.itemPrice = price;
		}

		public int getBasePrice() {
			return quantity * itemPrice;
		}

		public double getDiscountFactor() {
			if (getBasePrice() > 1000) {
				return 0.95;
			} else {
				return 0.98;
			}
		}

		public double getPrice() {
			return getBasePrice() * getDiscountFactor();
		}
	}

	public void Test() {
		Product p1 = new Product(100, 200);
		Product p2 = new Product(10, 50);
		System.out.println("Price 1 = " + p1.getPrice());
		System.out.println("Price 2 = " + p2.getPrice());
	}

	public static void main(String[] args) {
		JawabanTempToQuery t = new JawabanTempToQuery();
		t.Test();
	}
}
