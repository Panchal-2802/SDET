package practice_operators_variabledeclaration_variableassignment;

public class ReverseOfTwoDigit {

	public static void main(String[] args) {
		int input = 60;
		int rev1 = input % 10;
		int a = rev1;
		int rev2 = input / 10;
		int b = rev2;
		System.out.println("The reversed of two digit " + input + " is : " + rev1 + rev2);
		
		// method - 2 a proper way
		int res1 = input % 10;
		int res2 = input / 10;
		int reversed_num = res1*10 + res2;
		System.out.println("The reversed of two digit " + input + " is : " + reversed_num);
		/* by method - 2 the usera-input which consist last digit as 0 would be ignored because java ignored the '0' from leading position */
		


		// three digit reversed
		int user_input = 120;
		int digit1 = user_input % 10;
		int digit2 = (user_input /10 ) % 10;
		int digit3 = user_input / 100;
		int reversed_digit = digit1*100 + digit2*10 + digit3;
		System.out.println("The reversed of three digit " + user_input + " is : " + reversed_digit);
		
		// method - 2 for three digit reversed
		int New_digit = 001;
		int rev_last = New_digit % 10;
		int last_digit = rev_last; // 0
		int rev_middle_digit = New_digit / 10;
		int remain_two_digit = rev_middle_digit; //12
		int final_middle_digit = remain_two_digit % 10; // 2
		int first_digit = remain_two_digit / 10; // 1
		System.out.println("The reversed of given three digit " + New_digit + " is : " + last_digit + final_middle_digit + first_digit);
		
		
		
		
		

	}

}
