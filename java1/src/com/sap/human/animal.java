package com.sap.human;

import java.util.Scanner;



public class animal {
	public String name;
	public String colour;
	private String gender;
	public String legs;
	private String fly;
	public String place;
	public String eathabit;
	
	public animal(String N,String c,String l) {
		name=N;
		colour=c;
		legs=l;
		
	}
	
	public void walk(){
		System.out.print(name+"can walk");
	}
	public void sound() {
		System.out.println(name+"can say voice");
	}
	public void eat() {
		System.out.println(name+"can eat meat or vegetables");
	}
	public void fly() {
		System.out.println(name+"is an animal so can not fly");
	}
	public void living() {
		System.out.println(name+"can live in hotter areas or cold ones");
	}
	void setName (String N) {
		name=N;
		
	}
	String getName() {
		return name;
	}
	void setcolour(String co) {
		colour=co;
	}
	String getcolour() {
		return colour;
	}
	void setplace(String pl) {
		place=pl;
	}
	String getplace() {
		return place;
	}
	
	
		

}
