package Switch_case;

public class Calculator {
//Day-8
//Create a simple calculator program using 
//switch case that performs: +, -, *, /, % based on operator input.
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String operator = "!";
          switch(operator) {
	            case "+" : 
	                System.out.println("The addition of a & b : " + (a + b));
	                break;
	            case "-" :
	                System.out.println("The subtraction of a & b : " + (a - b));
	                break;
	            case "*" :
	                System.out.println("The multiplication of a & b : " + (a * b));
	                break;
	            case "/" :
	                if (b != 0) {
	                    System.out.println("The division of a & b : " + (a / b));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            case "%" :
	                if (b != 0) {
	                    System.out.println("The remainder of a & b : " + (a % b));
	                } else {
	                    System.out.println("Error: Modulo by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Not a valid operator");
		}
		
	}
}