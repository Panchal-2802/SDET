package practice_for_loop;

public class multiplyTwoDigitUsingAdditionOnly {

	public static void main(String[] args) {
	    int num1 = 5;
        int num2 = 4;
        int result = 0;

        for (int i = 0; i < num2; i++) { // i=1,2,3,4
            result += num1; // Add num1 to result num2 times
                      //5 +5+5+5
        }

        System.out.println("Product: " + result);
    }

	}


