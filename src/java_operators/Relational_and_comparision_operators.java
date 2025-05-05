package java_operators;

public class Relational_and_comparision_operators {

	public static void main(String[] args) {
		// Rule: It always return value in boolean (true or false)
		//operators are:- >, <, <=, >=, !=, ==
		
		int a=10, b=35;
		System.out.println("A is greater than B :" + (a>b));
		System.out.println("A is less than B :" + (a<b));
		System.out.println("A is greater than equal to B :" + (a>=b));
		System.out.println("A is less than equal to B :" + (a<=b));
		System.out.println("A is not eqaul to B :" + (a!=b));
		System.out.println("A is equal to B :" + (a==b));
		
		// logical operators
		//Rule:- It always return value in boolean
		// logical operator work between two boolean variables
        // x&&y , x||y, !x
		
		boolean x = true, y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20, b2=20>10;
		System.out.println("10 is greater than 20 :"+b1);
		System.out.println("20 is greater than 10 :"+b2);
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
	
	}
	

}
