package practice_operators_variabledeclaration_variableassignment;

public class ComplexArtmeticCalculation {

	public static void main(String[] args) {
		// a+b*c-d/e
		int a = 10, b = 35, c = 20, d = 25, e = 100;
		int Arithmetic_formula = ((a+b)*(c-d))/e;
		System.out.println("The calculation of aritmetic formula is " + Arithmetic_formula);
		System.out.println("The calculation of aritmetic formula is " + (a+b*c-d/e));

	}

}
