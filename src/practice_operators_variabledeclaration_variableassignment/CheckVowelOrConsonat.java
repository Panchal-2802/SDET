package practice_operators_variabledeclaration_variableassignment;

public class CheckVowelOrConsonat {

	public static void main(String[] args) {
		char value = '!'; 
		if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' ) {
			System.out.println("The Declare input value  is vowel ");
		}
		else if ((value >= 'a' && value <='z') || (value >='A' && value <='Z')) {
			System.out.println("The declare input value is consonant");
		}
		else {
			System.out.println("The declare input value either vowel nor consonant");
		}
	}

}
