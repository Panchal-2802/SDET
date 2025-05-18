package practice_if_else;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		int num = 25;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("The entered number is divisble by both 3 & 5");
		}
		else {
			System.out.println("The enetered number is not divisible 3 nor 5");
		}

	}

}
