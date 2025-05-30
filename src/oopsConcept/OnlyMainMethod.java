package oopsConcept;

public class OnlyMainMethod {
// Here i am calling the variable of class name with SimpleClass from same package
	// Note in same we cannot use repeated variable name
	public static void main(String[] args) {
		SimpleClass std1=new SimpleClass();
		std1.Age=15;
		std1.Std=9;
		std1.FirstName="Tushar";
		std1.MiddleName="Paresh";
		std1.LastName="panchal";
		std1.Printvalue();

	}

}
