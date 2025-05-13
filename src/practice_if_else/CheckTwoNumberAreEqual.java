package practice_if_else;

public class CheckTwoNumberAreEqual {

	public static void main(String[] args) {
		int a = 10, b = 10;
		int num1 = 10, num2=10;
		/*method 1 */
		if ((a-b)==0) {
			System.out.println("The given number are equal");
		}
		else {
			System.out.println("The given number are not equal");
		}
	   // Method 2
	
		 if (!(num1 > num2 || num1 < num2)) {
	            System.out.println("The two numbers are equal (using logical NOT method).");
	        } else {
	            System.out.println("The two numbers are not equal (using logical NOT method).");
	        }

	}

}
/* num1>num2 = true
num1<num2 = false
true || false = true therefore !true = false*/