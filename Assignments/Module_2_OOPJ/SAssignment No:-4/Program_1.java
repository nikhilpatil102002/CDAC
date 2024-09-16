package GetterSetter;
import java.util.*;
class LoanAmortizationCalculator {
	private double loanamount;
	private double annualinterestrate;
	private int loanterm ;
	
	public  LoanAmortizationCalculator(double loanamount,
	double annualinterestrate,
	int loanterm ) {
		this.loanamount=loanamount;
		this.annualinterestrate=annualinterestrate;
		this.loanterm=loanterm;
	}

	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

	public double getAnnualinterestrate() {
		return annualinterestrate;
	}

	public void setAnnualinterestrate(double annualinterestrate) {
		this.annualinterestrate = annualinterestrate;
	}

	public int getLoanterm() {
		return loanterm;
	}

	public void setLoanterm(int loanterm) {
		this.loanterm = loanterm;
	}
	
	public double calculateMonthlyPayment() {
      double monthlyInterestRate = (annualinterestrate / 12) / 100;
      int numberOfMonths = loanterm * 12;
      double monthlyPayment = loanamount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
              (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
      return monthlyPayment;
  }
	
	public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanterm * 12;
    }
	
	 public String toString() {
	        return "LoanAmortizationCalculator" +
	                "loanamount=" + loanamount +
	                ", annualinterestrate=" +  annualinterestrate+
	                ", loanTerm=" + loanterm +
	                '}';
	    }	
}

class LoanAmortizationCalculatorUtil {
	
	public static LoanAmortizationCalculator acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Loanamount	:	");
		double loanamount = sc.nextDouble();
		System.out.print("annualinterestrate	:	");
		double annualinterestrate = sc.nextDouble();
		System.out.print("loanterm   :	");
		int loanterm = sc.nextInt();
		System.out.println("");
		
		return new LoanAmortizationCalculator( loanamount, annualinterestrate, loanterm);
		
	}
	
	public static void printRecord(LoanAmortizationCalculator loan) {
		    System.out.println("\nLoan Details:");
	        System.out.println(loan.toString());
	        double monthlyPayment = loan.calculateMonthlyPayment();
	        double totalPayment = loan.calculateTotalPayment();

	        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
	        System.out.printf("Total Payment over the life of the loan: ₹%.2f%n", totalPayment);
	}
	
	 public static void menuList() {
	        System.out.println("1. Calculate Monthly Payment");
	        System.out.println("2. Exit");
	    }		
}
public class Program_1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        LoanAmortizationCalculator loan = null;

		        while (true) {
		            LoanAmortizationCalculatorUtil.menuList();
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    loan = LoanAmortizationCalculatorUtil.acceptRecord();
		                    LoanAmortizationCalculatorUtil.printRecord(loan);
		                    break;
		                case 2:
		                    System.out.println("Exiting...");
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		            }
		        }
	}
}




