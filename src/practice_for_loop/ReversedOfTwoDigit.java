package practice_for_loop;

public class ReversedOfTwoDigit {

	public static void main(String[] args) {
	  int digit = 120;
		int reversed = 0;
		for(int n = digit; n != 0; n = n / 10) {
			int number = n % 10;
			reversed = reversed * 10 + number;//3
			
		}
		System.out.println("Reversed Number: " + reversed);
		
	}
}

