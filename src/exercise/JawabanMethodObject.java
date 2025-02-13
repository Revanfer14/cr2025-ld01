package exercise;

import exercise.MethodObject.Account;

public class JawabanMethodObject {
	class Account {
		private int delta() {
			return 10;
		}
		
		public int gamma(int inputVal, int quantity, int yearToDate) {
			return new GammaCalculation(this, inputVal, quantity, yearToDate).calculate();
		}

	}
	
	class GammaCalculation {
		private Account account;
		private int inputVal;
		private int quantity;
		private int yearToDate;
		
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;
		
		public GammaCalculation(Account account, int inputVal, int quantity, int yearToDate) {
			this.account = account;
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}
		
		public int calculate() {
			importantValue1 = (inputVal * quantity) + account.delta();
			importantValue2 = (inputVal * yearToDate) + 100;
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			int importantValue3 = importantValue2 * 7;

			return importantValue3 - 2 * importantValue1;
		}
		
		
	}
	
	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15, 10, 2010));

	}

	public static void main(String[] args) {
		JawabanMethodObject p = new JawabanMethodObject();
		p.test();
	}
}
