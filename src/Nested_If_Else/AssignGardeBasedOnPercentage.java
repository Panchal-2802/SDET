package Nested_If_Else;

public class AssignGardeBasedOnPercentage {

	public static void main(String[] args) {
		int student_grade = 61;
		if(student_grade >0 && student_grade <=100)
			if(student_grade >=90) {
				System.out.println("Grade A");
			}
			else if(student_grade >=80) {
				System.out.println("Grade B");
			}
			else if(student_grade >= 70) {
				System.out.println("Grade C");
			}
			else if(student_grade >=60) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Failed");
			}
		else {
			System.out.println("Entered invalid percentage");
		}
	}

}
