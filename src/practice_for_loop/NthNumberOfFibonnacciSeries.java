package practice_for_loop;

public class NthNumberOfFibonnacciSeries {

	public static void main(String[] args) {
		int n=6;
		int a=0;
		int b=1;
		int NextFibonnaci = 0;
		//System.out.print(a+" " + b+ " ");
		for(int i=2; i<n; i++) {
			NextFibonnaci = a+b;
			a=b;
			b=NextFibonnaci;
		}
		System.out.print("The " + n + "th fibonnaci number is : " + NextFibonnaci);

	}

}
