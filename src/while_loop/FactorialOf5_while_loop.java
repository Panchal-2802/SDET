package while_loop;

public class FactorialOf5_while_loop {

	public static void main(String[] args) {
		int i=1;
		int num = 10;
		int factorial = 1;
		while(i<num) {
			factorial*=i;// factorial = factorial * i
			i++;
		}
		System.out.println("The factorial of " + num + " : " + factorial);

	}

}
