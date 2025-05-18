package while_loop;

public class FibonnacciSeries_while_loop {

	public static void main(String[] args) {
		int a=0, b=1;
		int i=2;
		System.out.print(a+" "+b+" ");
		while(i<=10) {
			int NextFibonnacci = a+b;
			System.out.print(NextFibonnacci + " ");
			a=b;
			b=NextFibonnacci;
			i++;
		}

	}

}
