package while_loop;

public class Fibonnaci_with_array_while_loop {

	public static void main(String[] args) {
		int i = 10;
		int Fibonacci[] = new int[i];
		Fibonacci[0]=0;
		Fibonacci[1]=1;
		while(i<=10) {
			Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
			System.out.print("The Value of 10 fibonacci value : " );
			i++;
		}

	}

}
