package practice;

public class Scalc2 extends calc3{
	
	 
	static int factorial(int d) {
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
	
	static int sumall(int d) {
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
	static int square(int e) {
		int sq; 
		sq=e*e; 
		return sq;
	}
	
	

}
