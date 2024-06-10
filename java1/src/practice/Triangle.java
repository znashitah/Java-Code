package practice;

public class Triangle implements Shape { 
	private int  a; 
	private int b;
	Triangle(int c,int d){ 
		a=c;
		b=d;
		
	}
	public int area(){  
		int q; 
		q=(a*b)/2; 
		return q;		
	} 
	public void display() {
		System.out.println("it is triangle");
	}

}
