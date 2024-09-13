package com.inheritance.demo;
class Student1 {
	private String name;
	private int prn;
	private String address;
	private String college;
	
	public Student1(String name,int prn,String address,String college) {
		this.name=name;
		this.prn=prn;
		this.address=address;
		this.college=college;
	}
	public void details() {
		System.out.println("Name : "+this.name);
		System.out.println("PRN : "+this.prn);
		System.out.println("Name : "+this.address);
		System.out.println("Name : "+this.college);
	}
}
public class Ex_4 {

	public static void main(String[] args) {
		Student1 st=new Student1( "nikhil",33,"Dhule","CDAC");
		st.details();
	}

}
