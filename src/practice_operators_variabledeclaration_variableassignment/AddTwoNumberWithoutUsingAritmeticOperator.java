package practice_operators_variabledeclaration_variableassignment;

public class AddTwoNumberWithoutUsingAritmeticOperator {

	public static void main(String[] args) {
		// Add two number without using + operator
		 int a = 5;   // first number
	      int b = 3;   // second number

	      while (b != 0) {
	          int carry = a & b;   // carry contains common set bits
	          a = a ^ b;           // sum of bits where at least one is not set
	          b = carry << 1;      // carry is shifted one bit to the left
	      }

	      System.out.println("Sum is: " + a);
	  }
	}

