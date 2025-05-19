package practice_for_loop;

public class PrintFirst10OddNumbers {

	public static void main(String[] args) {
		int count=0;
		for(int i = 1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println("Odd Number : " + i);
			}
			count++;
		}
		System.out.println();
		  
	}

}
