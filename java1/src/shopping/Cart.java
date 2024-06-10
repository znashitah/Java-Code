package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	Payment payment1;

	Cart(Payment c) {
		payment1 = c;

	}

	private List<Product> products = new ArrayList();

	void add(Product a) {

		products.add(a);

	}

	int totalamount() {
		int sum = 0;
		for (Product element : products) {
			System.out.println(element.getname());
			int price1 = element.getprice();

			sum = sum + price1;

		}
		return sum;
	}

	void payment() {
		payment1.pay();
	}

}
