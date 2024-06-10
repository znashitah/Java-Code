package com.sap.human;

public class dog {
	public String eyes;
	public String colour;
	public int age;
	public String gender;
	
	void barking() {
		System.out.println("yes dogs can bark and have eyes colour: "+eyes);
	}
	void mammals() {
		System.out.println("dog is a mammal,he has four legs");
	}
	void housekeeping() {
		System.out.println("dog is fatihfull, he can do very good housekeeping");
	}
	
	void seteyes(String a) {
		eyes=a;	
	}
	String geteyes() {
		
		return eyes;
	}
	void setage(int b) {    //seter hmesha void hota uska koch return nai hota or geter wai return krta jo usne li hoti
		if (b<0) {
			age=0;
			
		}
		else {
			age=b;
			
		}
	}
	int getage() {
		return age;
	}
	//constructor is a function, but it have same name as name of class,yh wala default constructor hai
	dog(){
		
	}
	//2nd constructor se sari values set ki jati hai jesy aik seter krta
	dog(String c,String d,int e, String f){
		eyes=c;
		colour=d;
		age=e;
		gender=f;
		
	}
		
		
	
	
		
		
	}


