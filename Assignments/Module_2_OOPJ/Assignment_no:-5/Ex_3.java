package com.inheritance.demo;

class Animal {
	private String name;

	public Animal() {
		this.name = name;
	}

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Name of Animal : " + this.name);
		System.out.println(name + " is...Eating");
	}

	public void sleep() {
		System.out.println(this.name + "Sleeping  : ");
	}
}

class Dog extends Animal {
	private String name;

	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println(name + " is Barking");
	}
}

public class Ex_3 {

	public static void main(String[] args) {
		Animal animal = new Animal("Lion");
		animal.eat();
		animal.sleep();

		Dog dg = new Dog("nilu");
		dg.eat();
		dg.sleep();
		dg.bark();

	}

}
