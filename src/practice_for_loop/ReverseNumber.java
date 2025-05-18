package practice_for_loop;

public class ReverseNumber {

	public static void main(String[] args) {
		int digit = 456789;
		int reversed = 0;
		for(int i = digit; i!=0; i=i/10) {
			int num = i%10;
			reversed = reversed * 10 + num;
		}
		System.out.println("Reversed Number : " + reversed);

	}

}
