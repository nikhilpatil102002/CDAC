package GetterSetter;

import java.util.*;

class DiscountCalculator {
	private double originalPrice;
	private double discountRate;
	private double finalPrice;

	public DiscountCalculator(double originalPrice, double discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
		this.finalPrice = 0.0;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public double calculateDiscountAmount() {
		return originalPrice * (discountRate / 100);
	}

	public void calculateFinalPrice() {
		double discountAmount = calculateDiscountAmount();
		this.finalPrice = originalPrice - discountAmount;
	}

	@Override
	public String toString() {
		return "Original Price: ₹" + originalPrice + "\nDiscount Rate: " + discountRate + "%" + "\nDiscount Amount: ₹"
				+ calculateDiscountAmount() + "\nFinal Price: ₹" + finalPrice;
	}
}

class DiscountCalculatorUtil {
	private Scanner sc = new Scanner(System.in);

	public DiscountCalculator acceptRecord() {
		System.out.print("Enter the original price of the item: ");
		double originalPrice = sc.nextDouble();
		System.out.print("Enter the discount rate: ");
		double discountRate = sc.nextDouble();

		return new DiscountCalculator(originalPrice, discountRate);
	}

	public void printRecord(DiscountCalculator discountCalculator) {
		discountCalculator.calculateFinalPrice(); // Calculate final price before printing
		System.out.println(discountCalculator);
	}

	public void menuList() {
		System.out.println("1. Calculate Discount");
		System.out.println("2. Exit");
	}
}

public class Program_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DiscountCalculatorUtil util = new DiscountCalculatorUtil();
		int choice;

		do {
			util.menuList();
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				DiscountCalculator discountCalculator = util.acceptRecord();
				util.printRecord(discountCalculator);
				break;
			case 2:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please select again.");
			}
		} while (choice != 2);

		sc.close();

	}

}
