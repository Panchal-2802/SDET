package polymorphism;

public class MethodOverloadding {
/*Rules to declare overloading method
 * All Method name should be same
 * Number of parameter should be different
 * When number of parameter is same then datatype should be different
 * Order of parameter should be different
 * */
	int a=10 , b=10;
	void method(long x, double y) {
		x=a;
		y=b;
	}
	void method() {
		System.out.println("Sum of a & b : " + (a+b));
	}
	void method(int x, int y) { // number of parameter is different
		System.out.println("Sum of x & y : " + (x+y));
	}
	void method(double x, int y) { // datatype of parameter is different
		System.out.println("Sum of x & y : " + (x+y));
	}
	void method(int y, double x) {// oder of parameter is different
		System.out.println("Sum of x & y : " + (x+y));
	}
	void method(double a, int b, double c) {
		System.out.println("Sum of a, b & c : " + (a+b+c));
	}
	public static void main(String[] args) {
		MethodOverloadding obj1 = new MethodOverloadding();
		//obj1.method();
		obj1.method(25, 25);
		obj1.method(25.5, 20);
		obj1.method(25, 42.5);
		obj1.method(15.5, 25, 32.5);
		

	}

}
