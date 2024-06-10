package com.sap.human;
import java.util.Scanner;

public class Maincar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		car2 mycar=new car2(20,"porsche","manual",false);
		 mycar.setname("porsche");
		 String z;
		z= mycar.getname();
		System.out.println(z); 
		int c;
		c=mycar.carcount();
		System.out.println(c);
		car2 whitecar=new car2(10,"bmw","auto",true);
		//whitecar.stopping(); 
		//whitecar.startcar();
		//whitecar.currentspeed(); 
		System.out.println(whitecar.getname()); 
		System.out.println(mycar.getname());
		int q;
		
		q=whitecar.currentspeed();
		System.out.println(q);
		int s;
		whitecar.braking(5);
		
		q=whitecar.currentspeed(); 
		System.out.println(q);
		whitecar.speeding(50);  
		whitecar.speeding(40);
		c=whitecar.carcount(); 
		System.out.println(c);
		
		q=whitecar.currentspeed(); 
		System.out.println(q); 
		car2 blackcar=new car2(15,"civic","manual",false);
		blackcar.startcar(); 
		blackcar.currentspeed();
		blackcar.speeding(15);
		int b;
		b=blackcar.currentspeed(); 
		System.out.println(b); 
		blackcar.braking(15);
		b=blackcar.currentspeed(); 
		System.out.println(b); 
		blackcar.stopping(); 
		blackcar.enginestop(); 
		c=blackcar.carcount();
		System.out.println(c);  
		System.out.println(blackcar.getname()); 
		System.out.println(whitecar.getname()); 
		System.out.println(mycar.getname());
		
		
		
		
		

	}

}
