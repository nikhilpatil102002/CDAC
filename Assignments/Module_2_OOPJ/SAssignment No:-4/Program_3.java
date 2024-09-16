package Assign_4_3;
import java.util.Scanner;

 class BMITracker {
	    private double weight; 
	    private double height; 

	    public BMITracker(double weight, double height) {
	        this.weight = weight;
	        this.height = height;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public double calculateBMI() {
	        return weight / (height * height);
	    }

	    public String classifyBMI() {
	        double bmi = calculateBMI();
	        if (bmi < 18.5) {
	            return "Underweight";
	        } else if (bmi >= 18.5 && bmi < 24.9) {
	            return "Normal weight";
	        } else if (bmi >= 25 && bmi < 29.9) {
	            return "Overweight";
	        } else {
	            return "Obese";
	        }
	    }

	    @Override
	    public String toString() {
	        double bmi = calculateBMI();
	        String classification = classifyBMI();
	        return "BMI: " + String.format("%.2f", bmi) + " - " + classification;
	    }
	}
	 class BMITrackerUtil {
	    private Scanner scanner = new Scanner(System.in);

	    public BMITracker acceptRecord() {
	        System.out.print("Enter weight (kg): ");
	        double weight = scanner.nextDouble();
	        System.out.print("Enter height (m): ");
	        double height = scanner.nextDouble();
	        return new BMITracker(weight, height);
	    }

	    public void printRecord(BMITracker bmiTracker) {
	        System.out.println(bmiTracker.toString());
	    }

	    public void menuList() {
	        System.out.println("1. Calculate BMI");
	        System.out.println("2. Exit");
	    }
	}
	public class Program_3 { 
	    public static void main(String[] args) {
	        BMITrackerUtil util = new BMITrackerUtil();
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            util.menuList();
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    BMITracker bmiTracker = util.acceptRecord();
	                    util.printRecord(bmiTracker);
	                    break;
	                case 2:
	                    exit = true;
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	        }
	        scanner.close();
	    }	
}
