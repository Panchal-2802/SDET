package practice_for_loop;

public class FindTheNumberIsPrimeOrNot {

	public static void main(String[] args) {
	    for (int i = 4; i < 10; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime Number: " + i);
            }
        }
	}
}
