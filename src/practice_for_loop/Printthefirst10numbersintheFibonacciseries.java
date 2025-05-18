package practice_for_loop;

public class Printthefirst10numbersintheFibonacciseries {
	//Print the first 10 numbers in the Fibonacci series.
	public static void main(String[] args) {
	int a=0, b=1;
	int n=10;
	System.out.print("The first 10 fibonacci series are : " + a +" " + b + " ");
	for(int i=2; i<n; i++) {
		int Fibonacci = a+b;
		System.out.print(Fibonacci + " ");
		a=b;
		b=Fibonacci;
	}

	}

}
