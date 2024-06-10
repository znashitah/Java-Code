package com.sap.human;

import java.util.Scanner;

public class calc1main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first digit");
		int a = scan.nextInt();
		
		System.out.println("enter second digit");
		int b = scan.nextInt();
		
		calc1 plus1=new calc1(a,b);
		int q;
		q=plus1.plus();
		System.out.println("addition is"+q);
		int r;
		r=plus1.min();
		System.out.println("subtraction is"+r);
		int s;
		s=plus1.M();
		System.out.println("multiplication is"+s);
		int t;
		t=plus1.d();
		System.out.println("division is"+t);
		// b not equal to zero, a+b is less then 1000
		
		
	}

	
	}


