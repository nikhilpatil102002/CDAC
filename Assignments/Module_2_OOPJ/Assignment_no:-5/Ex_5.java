package com.inheritance.demo;


class Vehicle1{
	private String name;
	
	public Vehicle1() {
		this.name=name;
	}
	public void startEngine() {
		System.out.println("Engine is Start");
	}
	public void stopEngine() {
		System.out.println("Engine is Stop");
	}	
}
class Car1 extends Vehicle1{
	private String name;
	
	
	public Car1(String name) {
		this.name=name;
	}
	public void startEngine() {
		System.out.println("Name of Car : "+this.name);
		System.out.println("Car Engine is Start");
	}
	public void stopEngine() {
		System.out.println("car Engine is Stop");
	}
}
class Motorcycle extends Vehicle1{
	private String name;
	public Motorcycle(String name) {
		this.name=name;
	}
	public void startEngine() {
		System.out.println("Name of Motorcycle : "+this.name);
		System.out.println("Motorcycle Engine is Start");
	}
	public void stopEngine() {
		System.out.println("Motorcycle Engine is Stop");
		System.out.println("=========================");
	}
}
public class Ex_5 {

	public static void main(String[] args) {
		
	Motorcycle mcy=new Motorcycle("Royal Enfield");	
    mcy.startEngine();
    mcy.stopEngine();
    
    Car1 cr=new Car1("Porche");
    cr.startEngine();
    cr.stopEngine();
    
	}	
}
