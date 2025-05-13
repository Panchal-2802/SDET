package practice_for_loop;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		int prime = 1;
		for(int i=prime; i!=0; i++) {
			if(i%prime ==0 && i%1==0) {
				System.out.println("The Given number is prime : " + i);
			}
			else {
				System.out.println("The Given number is not prime : " + i);
			}
		}

	}

}
