package practice;

import java.util.*;
public class main {

	public static void main(String[] args) {
		System.out.print("this is my first output.");
		System.out.println("hello");
		System.out.println("my new subject is OOP,I have new resolution, "); 

		int x=3, y=4 , sum;
		sum=x+y ; 
		System.out.print(sum);

		// now for loop:
		for (int i=0;i<3; i=i+1 ) {
			System.out.print(sum); 
		}

		//now while loop:
		int i=1;
		while (i<=5) {
			System.out.println(i);

			i=i+1;
		}
		//if else conditions:
//		int a=15;
//
//		if ( a<=19) {
//			System.out.println("you are teenager") ;
//		}
//		else if (a>19 && a<60) {
//			System.out.println("you are young");
//		}
//		else {
//			System.out.println("you are old"); 
//		} 
		// calculator, prime number,even number ,table of 2,
		// userinput:
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("Please enter your age:");
//		int in1 = scan.nextInt();
//		System.out.print(in1);
		
//		//calculator
//		int z=10, b=2, sum1, div,mult, sub;
//		sum1=z+b;
//		System.out.print(sum1);
//		div=z/b;
//		System.out.print(div);
//		mult=z*b;
//		System.out.print(mult);
//		sub=z-b;
//		System.out.print(sub);
//		//Write a Java program to get a number from the user and print whether it is positive or negative? 
//		System.out.println("please enter a number");
//	    int in2=scan.nextInt();
//	    
//	    if (in2>=0) {
//	    	System.out.println("positive");
//	    }
//	    else if (in2<0) {
//			System.out.println("negetive");
//		}
	    //Write a Java program that takes a number from the user between 1 and 7 and displays the name of the weekday.
	    //If 1 is entered then display Monday and so on. If number is not between 1 and 7 then
	    //keep asking the user to enter correct number
	 /*   while (true){
	    	System.out.println("enter a number between 1 and 7");
	    	 int in3=scan.nextInt();
	    	 if (in3==1) {
	         	System.out.println("Monday");
	         	break;
	         }
	    	 
	         else if (in3==2) {
	         	System.out.println("Tuesday");
	         	break;
	         }
	    	 
	         else if (in3==3) {
	         	System.out.println("Wednesday");
	         	break;
	         }
	         else {
	         	System.out.println("please enter correct one");
	         }*/
	    	 //Write a Java program that takes a year from user and print whether that year is a leap year or not.
	    	 System.out.println("enter a year");
	    	 int in4=scan.nextInt();
	    	 if (in4%4==0) {
	    		 System.out.println("This is leap year");
	    	 }
	    	 else {
	    		 System.out.println("This is not leap year");
	    	 } 
	    	 //Write a java program that takes a number from user and calculates square of all integers between 
	    	 //1 and the user number.
	    	 System.out.println("enter an integer");
	    	 int in5=scan.nextInt(), sq ;
	    	 for (int j=1;j<=in5; j=j+1) {
	    		 sq= j*j;
	    		 System.out.println(sq);
	    	 }
	    	//Write a program in Java to display the multiplication table of a given integer.
	    	 //Expected Output :

	    		// 5 X 0 = 0                                                                        
	    		// 5 X 1 = 5                                                                        
	    		// 5 X 2 = 10                                                                       
	    		 //5 X 3 = 15                                                                       
	    		// 5 X 4 = 20                                                                       
	    		 //5 X 5 = 25 
	    	 System.out.println("enter a digit");
	    	 int in6=scan.nextInt(), mu;
	    	 for(int c=0;c<=10; c=c+1) {
	    		 mu=c*in6;
	    		 System.out.println(in6 + " X " + c + " = " + mu);
	    	 }

	}
	
}