package practice_operators_variabledeclaration_variableassignment;

public class FindAsciiValueWithTypeCasting {

	public static void main(String[] args) {
		//method - 1 without type casting
		char ch = 'a';
		int ascii = ch;
		System.out.println("The Ascii vale of " + ch + " is : " + ascii);
		
		// method - 2 with type casting
		char ch1 = '1';
		int castAscii = (int) ch1;
		System.out.println("The Ascii value of " + ch1 + " is : " + castAscii);

	}

}
