package practice;

public class Rectangle implements Shape  { 
	private int a; 
	private int b;
	Rectangle(int c,int d){
		a=c; 
		b=d;
	}
	public int area() {
		int z; 
		z=a*b;
		return z;
	} 
	public void display() {
		System.out.println("this is a rectangle");
	} 
	public void girl() { 
		System.out.println("i am a good girl");
		
	}
	

}
