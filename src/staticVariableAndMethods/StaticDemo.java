package staticVariableAndMethods;
/*Static method and variable can easily access without creating object
 * we can one static method inside one non - static method but we can not called non-static method in static method
 * */
public class StaticDemo {
static int a=10; 
int b=20;
void method1() {
	System.out.println();
	System.out.println("This non - static method ");
	System.out.println(a);
	System.out.println(b);
}
static void method2() {
	System.out.println();
	System.out.println("This is static method ");
	System.out.println(a);
	//System.out.println(b); we cannot call non static variable via static method
}

	public static void main(String[] args) {
		System.out.println("The variable 'a' is called static variable : " + a);
		// static method calling
		method2();
		
		// non - static method and variable calling
		StaticDemo obj1 = new StaticDemo();
		System.out.println("The variable 'b' is non static : " + obj1.b);
		obj1.method1();

	}

}
