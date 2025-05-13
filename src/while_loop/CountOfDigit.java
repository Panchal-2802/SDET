package while_loop;

public class CountOfDigit {

	public static void main(String[] args) {
		int count = 0;
		int i=111111;
		while(i!=0) {
			count++;
			i=i/10;
		}
		System.out.println("Total Digit present in given digit are : " + count);

	}

}
