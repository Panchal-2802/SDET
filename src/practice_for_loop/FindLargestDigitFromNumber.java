package practice_for_loop;

public class FindLargestDigitFromNumber {

	public static void main(String[] args) {
		long number = 487;
		long largest = 0;
		for(long i=number; i!=0; i=i/10) {
			long digit = i%10;//487/10=7
			if(digit>largest) {
				largest=digit;
			}
		}
		System.out.println("The largest digit from " + number + " is : " + largest);
	}

}
