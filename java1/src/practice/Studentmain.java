package practice;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student usman = new Student("usman", 123, "cs", 1988);
		Student zainab = new Student();
		Student maryam = new Student("female");
		System.out.println(zainab.getcount());
		System.out.println(usman.getcount());

		usman.getbirthyear();
		usman.setbirthyear(1999);
		zainab.setname("zainab");
		zainab.setbirthyear(1998);
		zainab.setdegreeprogramm("ibs");
		zainab.setnumber(789);
		maryam.setname("maryam");
		maryam.setbirthyear(1996);
		maryam.setnumber(456);
		maryam.setdegreeprogramm("ibm");

		System.out.println(zainab.getname());
		System.out.println(zainab.getbirthyear());
		System.out.println(zainab.getcount());
		System.out.println(zainab.getnumber());
		System.out.println(zainab.getdegreeprogramm());

	}

}
