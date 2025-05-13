package practice_if_else;

public class CalculateLeapYear {

	public static void main(String[] args) {
		int year = 2000;
		if (year%400 == 0) {
			System.out.println("The entered number is a leap year because divisible by 400 : " + year);
		}
		else if (year%100 == 0) {
			System.out.println("The entered number is a leap year because is divisible by 100 but not by 400 : " + year);
		}
		else if (year%4 == 0) {
			System.out.println("The enetered number is a leap year because is divisbible by 4 : " + year);
		}
		else {
			System.out.println("The entered number is not matching criteria of leap year: " + year);
		}
	}	
}
