package staticVariableAndMethods;

/*If we want to called static method and variable of different class from same package
 * then we have to called it via classname as show here
 * */
public class StaticDemo2 {

	public static void main(String[] args) {
		System.out.println("The variable 'a' is called from different class of same package via static method : " +StaticDemo.a );
		// static method calling
		StaticDemo.method2();
		
		// non-static method
		StaticDemo obj1 = new StaticDemo();
		obj1.method1();
		
		String var1 = StaticDemo.var;
		System.out.println("The length of varaible : " + var1.length());
		System.out.println("Approach - 2 find length of variable " + StaticDemo.var.length());
		
		/*What is System.out.println() means?
		 * Ans:- System is a predefined class and out is a static variable and println is belong to PrintStream class (its a predefined java class) 
		 * */
		

	}

}
