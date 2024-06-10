package shopping;

public class Product {
	private String name;
	private String colour;
	private String type;
	private String size;
	private int Price;
	static int totalproductssold = 0;

	Product() {
		totalproductssold++;

	}

	Product(String a, String b, String c, int i) {
		totalproductssold++;

		name = a;
		colour = b;
		type = c;
		Price = i;
	}

	void setprice(int d) {
		Price = d;
	}

	int getprice() {
		return Price;

	}

	void setname(String a) {
		name = a;
	}

	String getname() {
		return name;
	}

	void settype(String b) {
		type = b;

	}

	String gettype() {
		return type;
	}

	static int gettotalsoldproducts() {
		return totalproductssold;
	}

}
