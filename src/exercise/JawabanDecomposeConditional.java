package exercise;

import java.util.Date;

public class JawabanDecomposeConditional {

	class Stadium {
		private final Date SUMMER_START = new Date(1500);
		private final Date SUMMER_END = new Date(2500);
		public double summerRate;
		public double winterRate;
		public double winterServiceCharge;

		public Stadium(double summer, double winter, double service) {
			this.summerRate = summer;
			this.winterRate = winter;
			this.winterServiceCharge = service;
		}

		public double calculateWinterPrice(int quantity) {
			System.out.print("Its winter! --> ");
			return quantity * winterRate + winterServiceCharge;
		}

		public double calculateSummerPrice(int quantity) {
			System.out.print("Its not winter! --> ");
			return quantity * summerRate;
		}
		
		public boolean isWinter(Date date) {
			return date.before(SUMMER_START) || date.after(SUMMER_END);
		}
		
		public double getTicketPrice(Date date, int quantity) {
			return isWinter(date) ? (calculateWinterPrice(quantity)) : (calculateSummerPrice(quantity));	
		}
	}

	public void test() {
		Stadium s = new Stadium(100, 90, 25);
		System.out.println(s.getTicketPrice(new Date(1000), 10));
		System.out.println(s.getTicketPrice(new Date(2000), 10));
		System.out.println(s.getTicketPrice(new Date(3000), 10));
	}

	public static void main(String[] args) {
		new JawabanDecomposeConditional().test();
	}

}
