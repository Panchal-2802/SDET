package oopsConcept;

public class SimpleClass {
	// Initialising the variable
	public int Std;
	public int Age;
	public String FirstName;
	public String LastName;
	public String MiddleName;
	
	// declaring a user defined method
	public void Printvalue() { // void return type is used because it just print statement 
		System.out.println(Std);
		System.out.println(Age);
		System.out.println(FirstName);
		System.out.println(MiddleName);
		System.out.println(LastName);
	}

	public static void main(String[] args) {
		// Now i am calling variable and method into main method to execute
		SimpleClass std1=new SimpleClass();
		std1.Std=8;
		std1.Age=14;
		std1.FirstName="Hardik";
		std1.LastName="Panchal";
		std1.MiddleName="Paresh";
		std1.Printvalue();

	}

}
