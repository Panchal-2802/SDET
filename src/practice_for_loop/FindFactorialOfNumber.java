package practice_for_loop;

public class FindFactorialOfNumber {
// formula :- n! = n(n-1)*(n-2)....*(n-n)
	public static void main(String[] args) {
		int number = 6;
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			 factorial*=i;// factorial = factorial * i
			              // fact = 1*1=1
			              // fact = 1*2=2
			              //fact = 3*2=6
			              //fact = 6*4=24
			              //fact = 5*24=120
			              //fact = 6*120=720
		}
		System.out.println("The Factorial of " + number + " is : " + factorial);

	}

}
