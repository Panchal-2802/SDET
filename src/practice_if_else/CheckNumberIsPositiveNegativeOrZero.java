package practice_if_else;

public class CheckNumberIsPositiveNegativeOrZero {

	public static void main(String[] args) {
		int input = -0;
		if(input>0) {
			System.out.println("The given number is positive : " + input);
		}
		else if(input<0) {
			System.out.println("The given number is negative : " + input);
		}
		else {
			System.out.println("The given number is either negative nor positive therefore is equal to zero : " + input);
		}

	}

}
