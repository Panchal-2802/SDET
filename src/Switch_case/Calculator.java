package Switch_case;

public class Calculator {
//Create a simple calculator program using 
//switch case that performs: +, -, *, /, % based on operator input.
	public static void main(String[] args) {
		int a=10;
		int b=20;
		String operator = "/";
		switch(operator) {
		case "+" : 
			System.out.println("The addition of a & b : " + (a+b));break;
		case "-" :
			System.out.println("The substraction of a & b : " + (a-b));break;
		case "*" :
			System.out.println("The multiplication of a & b : " + (a*b));break;
		case "/" :
			System.out.println("The divide of a & b : " + (a/b));break;
		case "%" :
			System.out.println("The multiplication of a & b : " + (a%b));break;
			default:
				System.out.println("Not entered a valid input");
		}
		
			
			

	}

}
