package com.sap.human;

import java.util.Scanner;

public class Maindog {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		dog whitedog=new dog();
		
		whitedog.barking();
		whitedog.seteyes("blue");
		String r;
		
		r=whitedog.geteyes();
		System.out.println(r);
		
		whitedog.barking();
		dog blackdog=new dog("grey","white",3,"female");  // two ways to set values and geting,this is new object
		blackdog.barking();

}
}
