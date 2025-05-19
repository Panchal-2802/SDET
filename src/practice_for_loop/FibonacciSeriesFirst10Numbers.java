package practice_for_loop;

public class FibonacciSeriesFirst10Numbers {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 10;
		System.out.print(a+" " + b+ " ");
		for(int i=2; i<=n; i++) {
			int NextFibonacci = a+b;
			System.out.print(NextFibonacci + " ");
			a=b;
			b=NextFibonacci;
			
		}
		/*System.out.println(" ");
 approach two with array
		int c=10;
		int Fibonacci[]=new int[c];
		Fibonacci[0]=0;
		Fibonacci[1]=1;
		for(int i=2; i<c; i++) {
			Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
		}
		System.out.print("The Value of 10 fibonacci value : " );
		for (int i=0; i<c; i++) {
			System.out.print(Fibonacci[i]+" ");
		}*/
	}
}
