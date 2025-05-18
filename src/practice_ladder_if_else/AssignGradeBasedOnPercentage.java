package practice_ladder_if_else;

public class AssignGradeBasedOnPercentage {

	public static void main(String[] args) {
		int percentage = 85;

		if (percentage >= 90 && percentage <= 100) {
			System.out.println("Grade: A");
		} else if (percentage >= 80) {
			System.out.println("Grade: B");
		} else if (percentage >= 70) {
			System.out.println("Grade: C");
		} else if (percentage >= 60) {
			System.out.println("Grade: D");
		} else if (percentage >= 0) {
			System.out.println("Grade: F (Fail)");
		} else {
			System.out.println("Invalid percentage entered.");
		}
	}
}
