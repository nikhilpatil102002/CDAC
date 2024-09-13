package com.inheritance.demo;

class BankAccount {
	private double balance;
	private double remain;
	private double amount;

	public BankAccount() {
		this.balance = balance;
		this.remain = remain;
		this.amount = amount;
	}

	public BankAccount(double balance, double amount) {
		this.balance = balance;
		this.amount = amount;
	}

	public double deposit() {
		System.out.println("Total Present amount: " + balance);
		System.out.println("Entered deposited amount: " + amount);
		if (balance > 0) {
			balance = balance + amount;
			System.out.println("Balance After deposited is: " + this.balance);
			System.out.println("===========================================");
		} else {
			System.out.println("Invalid amount ");
		}
		return balance;
	}

	public double withdraw() {

		if (amount > 0 && amount <= balance) {
			System.out.println("Withdraw " + amount);
		} else {
			System.out.println("Invalid Withdraw");
		}
		return amount;
	}
}

class SavingAccount extends BankAccount {
	private double balance;
	private double amount;
	private double remain;

	public SavingAccount() {
		this.balance = balance;
		this.amount = amount;
		this.remain = remain;
	}

	public SavingAccount(double balance, double amount, double remain) {
		this.balance = balance;
		this.amount = amount;
		this.remain = remain;
	}

	public double withdraw() {
		System.out.println("Total Balance : " + this.balance);

		if (amount > 0 && amount <= balance) {
			System.out.println("Withdraw " + amount);
		} else {
			System.out.println("Invalid Withdraw");
		}
		return amount;
	}

	public void remain1() {
		double remain = balance - amount;
		System.out.println("remaining balance: " + this.remain);
	}
}

public class Ex_1 {

	public static void main(String[] args) {
		System.out.println("Account Details");

		SavingAccount sc = new SavingAccount(150000, 100000, 50000);

		BankAccount bc = new BankAccount(15000, 5000);

		bc.deposit();
		sc.withdraw();
		sc.remain1();
	}
}
