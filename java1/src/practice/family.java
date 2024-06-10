package practice;

public class family {
	
	private static int members; 
	private static int familyincome;
	
	private int income; 
	private String who;   
	private  int expenses; 
	family(int a,String b){ 
		income=a;
		 members=members+1;	
		 familyincome=familyincome+income;
		
		 who=b;
		 
	} 
	int getmembers() {
		return members;
	} 
	int getfamilyincome() {
		return familyincome;
	} 
	int getincome() {
		return income;
	} 
	void  shoping(int s) {
		familyincome=familyincome-s ; 
		expenses=expenses+s;
		
	} 
	int getexpenses() {
		return expenses;
	}
	
	
	

}
