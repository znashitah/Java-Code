package practice;

public class Scalc extends calc2{
	
	private int c;
	private int d; 
	int factorial(int d) {
		int i; 
		int s;
		 s=1;
		i=1; 
		while(i<=d) {
			s=s*i;
			i=i+1; 		
		}
		return s;
	} 
	Scalc(int a,int b) {
		super(a,b);
		c=a;
		d=b;
	} 
	int sumall(int d) {
		int q; 
		int i;
		q=0;
		i=0;
		while (i<=d) {
			q=q+i;
			i=i+1;
		}
		return q;
	} 
	int square(int e) {
		int sq; 
		sq=e*e; 
		return sq;
	}
	
	

}
