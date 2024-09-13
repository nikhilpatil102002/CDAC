package com.inheritance.demo;

//class Person{
//	private String name;
//	private int age;
//	
//	public Person( ) {
//		this.name = "";
//		this.age = 0;
//	}
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public void printRecord( ) {
//		System.out.println("Name	:	"+this.name);
//		System.out.println("Age	:	"+this.age);
//	}
//	
//	@Override
//	public String toString() {
//		return this.name+"	"+this.age;
//	}
//}
//
//class Employee extends Person{
//	private int empid;
//	private float salary;
//	
//	public Employee() {
//		this.empid = 0;
//		this.salary = 0.0f;
//	}
//	
//	public Employee(String name, int age , int empid, float salary) {
//		super( name, age );
//		this.empid = empid;
//		this.salary = salary;
//	}
//	
//	@Override
//	public void printRecord( ) {
//		super.printRecord();
//		System.out.println("Empid	:	"+this.empid);
//		System.out.println("Salary	:	"+this.salary);
//	}
//	@Override
//	public String toString() {
//		return  super.toString()+"	"+this.empid+"	"+this.salary;
//	}
//}
//
//public class Program {
//	public static void main(String[] args) {
//		Employee emp = new Employee("Sandeep",40, 33, 45000.50f );
//		//emp.printRecord();
//		System.out.println( emp.toString() );
//	}
//}

class Man{
	private String name;
	private int age;
	
	public Man() {
		this.name="Nikhil Patil";
		this.age=22;
	}
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void printRecord() {
		System.out.println("Name :  "+this.name);
		System.out.println("Age :  "+this.age);
	}

}
class Student extends Man{
	private int stdid;
	private String address;
	
	public Student() {
		this.stdid=10;
		this.address="Dhule";
	}
	public Student(String name,int age,int stdid,String address) {
		super(name,age);
		this.stdid=stdid;
		this.address=address;
	}
	
	public void printRecord() {
		super.printRecord();
		System.out.println("Student_Id :  "+this.stdid);
		System.out.println("Address :  "+this.address);
	}	
}

public class Assign_5_Ex1 {

	public static void main(String[] args) {
		Student st=new Student();
		st.printRecord();
		
		
		Man m=new Man();
	//	m.printRecord();
		
		m.setName("Krishna");
		m.getName();
		
//		st.setName("nikhil");
//		System.out.println("Name : "+st.getName());
		
	}

}
