package assignments;
import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		add(29);
		System.out.println("enter your salary");
		int totalsalary=scan.nextInt();
		System.out.println("enter a digit for tax percentage");
		int p=scan.nextInt();
		tax(totalsalary,p);
		System.out.print("hello,my schatz");
		int x=3, y=4, sum;
		sum=x+y; 
		System.out.print(sum);
		for (int i=1;i<4;i=i+1) {    //to print all digits singal
		System.out.println(i);
			
		}
		int i=0;
		while (i<10) {
			System.out.println(i);   //to print all numbers by while loop
			i=i+1;
		}
		//calculator
		System.out.println("enter first digit");
		int a=scan.nextInt();
		System.out.println("enter second digit");
		int b=scan.nextInt();
		int ad=adding(a,b);
		System.out.println("addition is "+ ad);
		int mi=minus(a,b);
		System.out.println("subtraction is "+mi);
		int mu=multiplying(a,b);
		System.out.println("multiplying is " +mu);
		int di=dividing(a,b);
		System.out.println("division is "+di);
		//square 
		System.out.println("enter a digit");
		int sq=scan.nextInt();
		
		 square(sq);
	
		//plus
		System.out.println("enter digit for plus");
		int plus1=scan.nextInt();
		int p1=plus(plus1);
		System.out.println("plus value is " +p1);
		
	
		
		
	} 
	static void add(int age) {
		
		
		if (age<10) {
			System.out.println("you are in school");
			
		}
		else if(age<20) {
			System.out.println("you are in college");
		}
		else {
			System.out.println("you are in university or doing work");
		}
	}
	static void tax(int totalsalary, int p) {
		int taxvalue=totalsalary * p/100;
		System.out.println("your tax is "+taxvalue);
		
	}
	static int adding(int a,int b) {
		int addition;
		addition=a+b;
		return addition;
	}
	static int minus(int a,int b) {
		int min;
		min=a-b;
		return min;
	}
	static int multiplying(int a,int b) {
		int mult;
		mult=a*b;
		return mult;
	}
	static int dividing(int a,int b) {
		int div;
		div=a/b;
		return div;
	} 
	//square,plus 
	static void square(int sq) {
		int s;
		
		for (int i=1;i<sq;i=i+1) {
			s=i*i;
			System.out.println(s);
			}
		
			
					
					
			
		}
	static int plus(int plus ) {
		int pl=0;
		for (int i=1;i<plus;i=i+1) {
			pl=i+ pl;
			
		}
		return pl;
	}
	
	}
	
	
		
	
		
		
				
		
	
	

	


