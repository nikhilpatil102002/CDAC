package com.inheritance.demo;

class Vehicle {
	private String make;
	private int year;

	public Vehicle() {
		this.make = make;
		this.year = year;
	}

	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public void dislay() {
		System.out.println("make by  : " + this.make);
		System.out.println("year  : " + this.year);
	}
}

class Car extends Vehicle {
	private String make;
	private int year;
	private String model;
	public Car() {
		this.model = model;
	}
	public Car(String make, int year, String model) {
		
		super (make,year);
		this.model = model;
	}
	
	public void display() {
		System.out.println("make by  : " + this.make);
		System.out.println("year  : " + this.year);
		System.out.println("model  : " + this.model);
		
	}
}
public class Ex_2 {

	public static void main(String[] args) {
		Car cr = new Car("TATA",2011,"New");
		cr.display();
	}
}



