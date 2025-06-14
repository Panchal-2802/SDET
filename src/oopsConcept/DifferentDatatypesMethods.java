package oopsConcept;
/*- No parameter along with no return value
- No parameter along with return value
- With parameter with no return value 
- with parameter with return value*/
public class DifferentDatatypesMethods {
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
		DifferentDatatypesMethods obj1 = new DifferentDatatypesMethods();
		System.out.println("-- No parameter along with on return value --");
		obj1.firstName();
		System.out.println();
		
		DifferentDatatypesMethods obj2 = new DifferentDatatypesMethods();
		System.out.println("--No parameter along with return value -- ");
		String my = obj2.LastName();// always use variable to store the result and then print variable
		System.out.println(my);
		System.out.println();
		
		DifferentDatatypesMethods obj3 = new DifferentDatatypesMethods();
		System.out.println("-- with parameter along with no return value ");
		obj3.method3(8);
		System.out.println();
		
		DifferentDatatypesMethods obj4 = new DifferentDatatypesMethods();
		System.out.println("-- with parameter with return value ");
		String designation = obj4.Method4("Quality Assurance");
		System.out.println(designation);
		System.out.println(designation);
		
		

	}

}
