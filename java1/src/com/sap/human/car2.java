package com.sap.human;

public class car2 {
	static int  carcount;
	public int speed; 
	public    String name;
	public String type; 
	boolean enginestart=false;
	public  void speeding(int r) {
		if ( enginestart==true ) {
			

			speed=speed+r;
			
			
		}
		 
		
		
		
		
	}
	void braking(int w) {
		speed=speed-w;
		
		
	}
	int carcount() {
		return carcount;
	}
	int currentspeed() {
		return speed;
	}
	car2(int a,String b,String c,boolean d){
		carcount=carcount+1;
		if (d==true) {
			speed=a;
		}
		else{
			speed=0;
		}
		

		name=b;
		type=c;
		enginestart=d;
		
	}
	void setname(String b) {
		name=b;
		
	}
	String getname() {
		return name;
	}
	
	 void startcar(){
		 enginestart=true; 
		 System.out.println("now car is started");
		
	}
	 
	void stopping() {
		
		if (speed==0) {
			System.out.println("Yes,now car is stopped,but engine is running");
			
			
		}
		if (speed==0 && enginestart==false) {
			System.out.println("now car is fully stopped");
			
		}
		if (speed>0) {
			System.out.println("car is not stopped");
		}
	}
	void enginestop() {
		enginestart=false;
		System.out.print("now car is fully stoped,engine closed");
	}
		 
		 
	 }
	


