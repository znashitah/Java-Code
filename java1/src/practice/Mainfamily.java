package practice;

public class Mainfamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		family usman=new family(2500,"father"); 
		usman.getfamilyincome(); 
		usman.getmembers();
		System.out.println(usman.getfamilyincome()); 
		System.out.println(usman.getmembers()); 
		usman.getincome(); 
		System.out.println(usman.getincome()); 
		family nashitah=new family(2400,"mother"); 
		System.out.println(nashitah.getfamilyincome()); 
		System.out.println(nashitah.getmembers()); 
		System.out.println(nashitah.getincome());
		
		System.out.println(usman.getfamilyincome()); 
		System.out.println(usman.getmembers()); 
		usman.shoping(50);
		usman.getexpenses(); 
		System.out.println(nashitah.getfamilyincome()); 
		nashitah.shoping(70);
		nashitah.shoping(60);
		nashitah.shoping(30);
		nashitah.shoping(300);
		System.out.println(nashitah.getfamilyincome()); 
		
		System.out.println(usman.getexpenses());
		System.out.println(nashitah.getexpenses()); 

	}

}
