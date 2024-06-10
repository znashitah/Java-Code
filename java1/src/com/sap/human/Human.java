package com.sap.human;

public class Human {
	private String name ;
	private int age ;
	private String colour;
	private float height;
	private String dob;
	private Integer weight;
	private String gender;
	public Human() {
		
	}
	public Human(String N1,int a,String cl) {
		name=N1;
		age=a;
		colour=cl;
	}

	
	public void walk() {
		System.out.println(name+" can walk");
	}
	public void sleep() {
		System.out.println(name+"can sleep more than me");
	}
	public void listen() {
		System.out.println(name+"can listen ");
	}
	public float getBMI(){
		float BMI;
		BMI= weight/(height*height);
		return BMI;
	}
	boolean isadult() {
		if (age<18) {
			
			return false;
		}
		else{
			return true;
		}
		
	}
	
	
	void setName(String n) {
		name=n;
		
	}
	String getName() {
		return name;
	}
	void setAge(int a) {
		age=a;
	}
	int getAge() {
		return age;
		
	}
	void setColour(String c) {
		colour=c;
	}
	String getColour() {
		return colour;
	}
	void setHeight(float h) {
		height=h;
	}
	float getHeight() {
		return height;
	}
	void setDob(String d) {
		dob=d;
	}
	String getDob() {
		return dob;
		
	}
	void setWeight(Integer w) {
		weight=w;
	}
	Integer getWeight() {
		return weight;
	}
	void setGender(String g) {
		gender=g;
	}
	String getGender() {
		return gender;
	}
	
	

}
