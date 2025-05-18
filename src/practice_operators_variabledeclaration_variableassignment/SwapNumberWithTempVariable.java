package practice_operators_variabledeclaration_variableassignment;

public class SwapNumberWithTempVariable {

	public static void main(String[] args) {
		int A = 10, B = 20;
		System.out.println("-- Before Swappin with temp variable -- ");
		System.out.println(" before swapping value of A is : " + A);
		System.out.println(" before swapping the value of B is : " + B);
		
		int Temp_c = A;
		 A=B;
		 B = Temp_c;
		 System.out.println(" -- after swapping with temp variable -- ");
		 System.out.println(" The value of A after swap : " + A);
		 System.out.println(" The value of B after swap : " + B);
		

	}

}
