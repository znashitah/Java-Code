package practice;

public class Mainfamily2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Religion r1 = new Religion("islam", "sunni");
		Religion r3 = new Religion("christ", "jesus");
		Family2 usman = new Family2("usman", "pakistani", 0, "furtwangen", r1);
		System.out.println(usman.getLocation());
		usman.setmembers("zainab");
		usman.setmembers("usman");
		System.out.println(usman.getmembers());
		Religion r2;

		r2 = usman.getReligion();
		System.out.println(r2.getName());
		System.out.println(r2.getSect());
		usman.setReligion(r3);
		Religion r4;
		r4 = usman.getReligion();
		System.out.println(r4.getName());
		System.out.println(r4.getSect());

	}

}
