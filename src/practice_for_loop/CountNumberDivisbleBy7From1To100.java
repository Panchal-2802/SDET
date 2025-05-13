package practice_for_loop;

public class CountNumberDivisbleBy7From1To100 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%7==0) {
				count++; // count = count + 1
				System.out.print(" " + i);	
			}
			
		}
		System.out.println(" ");
		System.out.println("The Total number divisble by 7 from 1 to 100 : " + count);
	}

}
