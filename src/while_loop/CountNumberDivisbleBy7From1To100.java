package while_loop;

public class CountNumberDivisbleBy7From1To100 {

	public static void main(String[] args) {
		int count=0;
		int i=1;
		while(i<=100) {
			if(i%7==0) {
				count++;
				System.out.print(" " + i);
			}
			i++;
		}
		System.out.println(" ");
		System.out.println("The Total Number Divisible by 7 from 1 to 100 are : " + count);

	}

}
