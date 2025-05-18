package practice_if_else;

public class CheckLastDigitIsEvenOrOdd {

	public static void main(String[] args) {
		long digit = 2555555555555559l;
		long res = digit % 10;
		if(res % 2 == 0) {
			System.out.println("The last digit of number is even : " + res);
		}
		else {
			System.out.println("The last digit of number is odd : " + res);
		}

	}

}
