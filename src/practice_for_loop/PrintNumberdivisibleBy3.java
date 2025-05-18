package practice_for_loop;

public class PrintNumberdivisibleBy3 {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println("The Number is divisible by 3 : "+i);
			} 
			/*else {
				System.out.println("The number is not divisible by 3 :" + i);
			}*/
		}

	}

}
