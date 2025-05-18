package practice_operators_variabledeclaration_variableassignment;

public class AdditionOfNumber {
/* In this problem we have to calculate 
 * sum of digit provide by user input or declared variable
 */
	public static void main(String[] args) {
		int input = 123; // output = 1+2+6 =9
		int last_digit = input % 10; // 6
		int remain_two_digit = input / 10; // 12
		int middle_digit = remain_two_digit % 10; // 2
		int first_digit = remain_two_digit / 10; // 1
		System.out.println("The addition of given digit " + input + " is : " + (first_digit+middle_digit+last_digit));
		
		

	}

}
