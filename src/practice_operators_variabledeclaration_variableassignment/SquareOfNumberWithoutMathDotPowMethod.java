package practice_operators_variabledeclaration_variableassignment;

public class SquareOfNumberWithoutMathDotPowMethod {

	public static void main(String[] args) {
		//method - 1
		int number = 10;
		int result = (number*number);
		System.out.println("The Square of " + number + " is " + result);
		
		// method - 2 with math.pow()
		int a = 100;
		double result_2 = Math.pow(a, 2);
		System.out.println("The square of " + a + " by math.pow is : " + result_2);

	}

}
/*
   Yes, Java provides a predefined method to calculate the cube of a number using the Math.pow() method. 
   This method takes two arguments: the base and the exponent. 
   To find the cube of a number, the number should be passed as the base and 3 as the exponent. 
   The method returns a double value representing the result of the power operation.
 */