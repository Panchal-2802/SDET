package practice_if_else;

public class PrintNumberIsSingleDigitDoubeDigitOrMore {

	public static void main(String[] args) {
		int number = -9;
		if (number/10 == 0) {
			System.out.println("The entered number is single digit : " + number);
		}
		else if(number/100 == 0) {
			System.out.println("The entered number is double digit : " + number);
		}
		else if(number / 1000 == 0) {
			System.out.println("The entered number is three digit : " + number);
		}
		else {
			System.out.println("The entered number is more than three digit : " + number);
		}
		
		// only for positive number
		 /* if (number >= 0 && number <= 9) {
	            System.out.println("The entered number is single-digit: " + number);
	        } else if (number >= 10 && number <= 99) {
	            System.out.println("The entered number is double-digit: " + number);
	        } else if (number >= 100 && number <= 999) {
	            System.out.println("The entered number is three-digit: " + number);
	        } else {
	            System.out.println("The entered number has more than three digits: " + number);
	        }*/
		  
		  // including negative number
		  /*if (number <= 9) {
	            System.out.println("The entered number is single-digit: " + number);
	        } else if (number <= 99) {
	            System.out.println("The entered number is double-digit: " + number);
	        } else if (number <= 999) {
	            System.out.println("The entered number is three-digit: " + number);
	        } else {
	            System.out.println("The entered number has more than three digits: " + number);
	        }*/
			
	}

}
