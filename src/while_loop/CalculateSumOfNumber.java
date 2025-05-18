package while_loop;

public class CalculateSumOfNumber {

	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.print("The sum of 1 to 10 number : " + sum);

	}

}
