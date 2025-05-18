package do_while_loop;

public class PrintEvenNumberFrom1To10_do_while_loop {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println("Even Number : " + i);
			}
			else {
				System.out.println("Odd NUmber :" + i);
			}
			i++;
		}while(i<=50);

	}

}
