package practice;

import java.sql.*;

public class Mainscalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scalc mycalc = new Scalc(3, 4);
		System.out.println(mycalc.factorial(5));
		System.out.println(mycalc.sumall(4));
		System.out.println(mycalc.square(3));
		System.out.println(mycalc.plus());
		// inherit superclass calc2 function
		System.out.println(Scalc2.factorial(4)); // inherit calc3 in scalc2 class

		Shape shape = new Rectangle(3, 4); // if we use interface name(shape instead of class name it will use only
		// interface methods(shape) and when use class name rectangle inplace of shape
		// it will give all functions

		System.out.println(shape.area());
		shape.display();
		Rectangle myarea2 = new Rectangle(3, 4);
		myarea2.girl();
		shape = new Circle(5);
		System.out.println(shape.area());
		shape.display();
		shape = new Triangle(3, 4);
		System.out.println(shape.area());
		shape.display();

	}

}
