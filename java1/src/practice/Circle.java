package practice;

public class Circle implements Shape {
	private int d; 
	 
    Circle(int a) {
		 d=a; 
		 
	 }  
    public int area() {
    	int r; 
    	r=3*d*d; 
    	return r;
    } 
    public void display() {
    	System.out.println("yes it is circle");
    }
	

}
