package shopping;

public class Productmain {

	public static void main(String[] args) {
		Product milk = new Product();
		Product lotion = new Product("gellotion", "blue", "korperpflege", 3);

		milk.setname("schwarzwald");
		milk.setprice(2);
		milk.settype("diaryproduct");
		Payment Paypal = new Paypal();
		Payment visacard = new Visacard(); // paypal object of visacard but interface payment take this
		Cart cart1 = new Cart(Paypal);
		cart1.add(milk);
		cart1.add(lotion);
		System.out.println(milk.getprice());
		cart1.totalamount();
		System.out.println(cart1.totalamount());
		cart1.payment();
		System.out.println(milk.gettotalsoldproducts());
		System.out.println(Product.gettotalsoldproducts()); // static method is also class method so called directely on
		// class name.like product.getnumber()

		System.out.println(lotion.gettotalsoldproducts()); // static variable also called class variable;

	}

}
