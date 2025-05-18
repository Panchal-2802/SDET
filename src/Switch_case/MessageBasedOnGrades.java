package Switch_case;

public class MessageBasedOnGrades {

	public static void main(String[] args) {
		char Grades = 'B';
		
		switch(Grades) {
		
		case 'A':
			System.out.println("Congratulation you have secured grade : " + Grades);break;
			
		case 'B':
			System.out.println("Congratulation you have secured grade : " + Grades);break;
			
		case 'C':
			System.out.println("Congratulation you have secured grade : " + Grades);break;
		}
		
	}
	// break statment is necessary to use because its print the output of matched condition
	// if we missed then it print all the statement from the below the matched block of code
	

}
