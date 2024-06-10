package practice;

import java.util.Scanner;

public class Functions {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		names("M.Ali jinnah");
		names("Allama Iqbal");
		names("SirSyedAhmedKhan");
		data("zainab",25);
		data("usman",34);
		add(12);
		int r=add(12);
		System.out.println(r);
		
		int z =addition(10,20);
		System.out.println(z);
		
		
		

		// TODO Auto-generated method stub
		// functions,arrays(list),
	
		/*
		 * System.out.println("enter a digit"); int no=scan.nextInt();
		 * 
		 * boolean isprime=primenu( no); if (isprime==true) {
		 * System.out.println("number is prime : "+no); } else {
		 * System.out.println("number is not prime"); }
		 */

	}
	static void mymethod() {
		System.out.println("a new function") ;
	}
	static boolean primenu(int nu) {
		int result, i ;
		boolean  isprime=true;
		for (i=2;i<nu ; i=i+1 ) {
			if (nu%i==0 ) {

				isprime=false;
				break ;

			}
		}
		return isprime;
	}

	static void names(String fname) {
		System.out.println(fname+" heros ");
		
	}
	static void data(String fname, int age) {
		System.out.print(fname+" is "+age+" years old ");
	} 
	static int add(int x) {
		int r;
		return r=5 +x;
	}
	static int addition(int x,int y) {
		return x+y;
	}
	

}
