package practice_if_else;

public class avgOfSubject {
	//Given marks of 5 subjects, find total, average and pass/fail (if any subject <35).

	public static void main(String[] args) {
		int maths = 70, english = 36, hindi = 36, social = 65, biology = 80;
		int marks_all_subject = maths+english+hindi+social+biology;
		int avg_marks = marks_all_subject / 5;
		System.out.println("Total marks in all subject : " + marks_all_subject);
		System.out.println("Average marks : " + avg_marks);
		
		if (maths < 35 || english < 35 || hindi < 35 || social <35 || biology < 35) {
			System.out.println("You are failed in one or more subjects so you are failed ");
		}
		else {
			System.out.println("Congratulation you are passed ");
		}

	}

}
