package practice_if_else;

public class CalculateGrades {
	
	//Q14. Determine if a grade is: A (90+), B (75–89), C (60–74), or Fail (<60).
	
	public static void main(String[] args) {
		int Student_grades = 61;
		if (Student_grades >= 90) {
			System.out.println("Your grade would be 'A' ");
		}
		else if(Student_grades >= 75 && Student_grades <= 89){
			System.out.println("Your grade would be 'B' ");
		}
		else if(Student_grades >= 60 && Student_grades <= 74) {
			System.out.println("Your grade would be 'C' ");
		}
		else {
			System.out.println("You are failed in examination");
		}
		}

	}

