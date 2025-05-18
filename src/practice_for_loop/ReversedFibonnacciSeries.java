package practice_for_loop;

public class ReversedFibonnacciSeries {

	public static void main(String[] args) {
		 int n = 10;
	        int[] fib = new int[n];

	        // Generate the Fibonacci series first
	        fib[0] = 0;
	        fib[1] = 1;
	        for (int i = 2; i < n; i++) {
	            fib[i] = fib[i - 1] + fib[i - 2];
	        }

	        // Now print it in reverse
	        System.out.print("Reverse Fibonacci series:");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(fib[i] + " ");
	        }
	}

}
