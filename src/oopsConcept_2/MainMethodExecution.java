package oopsConcept_2;
import oopsConcept.SimpleClass;// to call variable of different class of different i have just import the package.
// structure :- packageName.className
public class MainMethodExecution {
// here i am calling variable of different class of different package
	// Note:- to call variable of different class from different package all the varaible and method should be public
	public static void main(String[] args) {
		SimpleClass std3 = new SimpleClass();
		std3.Std=9;
		std3.Age=25;
		std3.FirstName="Chayya";
		std3.MiddleName="Dayabhai";
		std3.LastName="Panchal";
		std3.Printvalue();
		

	}

}
