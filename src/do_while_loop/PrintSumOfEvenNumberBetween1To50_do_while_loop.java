package do_while_loop;

public class PrintSumOfEvenNumberBetween1To50_do_while_loop {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do {
			if(i%2==0) {
				sum+=i;
			}
			
			i++;
			
		}while(i<=50);
		System.out.println("The sum of even number in 1 to 50 is : " + sum);
		

	}

}
