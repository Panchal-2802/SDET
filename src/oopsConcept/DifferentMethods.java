package oopsConcept;
/*- No parameter along with no return value
- No parameter along with return value
- With parameter with no return value 
- with parameter with return value*/
public class DifferentMethods {
	// No parameter along with no return value
	void firstName() {
		System.out.println("Hardik");
	}
	
	//No parameter along with return value
	String LastName() {
		return "Panchal";
	}
	
	// with parameter no return value 
	void method3(int age) {
		System.out.println(age);
	}

	// with parameter return value 
	String Method4(String designation) {
		return "designation : " + designation;
	}
	public static void main(String[] args) {
		DifferentMethods obj1 = new DifferentMethods();
		System.out.println("-- No parameter along with on return value --");
		obj1.firstName();
		System.out.println();
		
		DifferentMethods obj2 = new DifferentMethods();
		System.out.println("--No parameter along with return value -- ");
		String my = obj2.LastName();// always use variable to store the result and then print variable
		System.out.println(my);
		System.out.println();
		
		DifferentMethods obj3 = new DifferentMethods();
		System.out.println("-- with parameter along with no return value ");
		obj3.method3(8);
		System.out.println();
		
		DifferentMethods obj4 = new DifferentMethods();
		System.out.println("-- with parameter with return value ");
		String designation = obj4.Method4("Quality Assurance");
		System.out.println(designation);
		System.out.println(designation);
		
		

	}

}
