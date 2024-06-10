package com.sap.human;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Human nashitah=new Human();
		nashitah.setAge(25);
		nashitah.setColour("brown");
		nashitah.setDob("08.04.1998");
		nashitah.setGender("female");
		nashitah.setWeight(57);
		nashitah.setHeight(150);
		nashitah.setName("nashitah");
		nashitah.walk();
		nashitah.listen();
		nashitah.sleep();
		float n;
		n=nashitah.getBMI();
		System.out.println("BMI of nashitah is "+n);
		nashitah.isadult();
		boolean y;
		y=nashitah.isadult();
		System.out.println("is this person is adult "+y);
		Human usman=new Human();
		usman.setName("usman");
		usman.setAge(35);
		
		Human Sam =new Human("sam",20,"brown");
		Sam.walk();
		
		
		animal cat=new animal("cat","grey","4");
	
		cat.setplace("houses, warm places");
		cat.walk();
	
		
		

		
		
	}

}
