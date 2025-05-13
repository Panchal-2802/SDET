package practice_for_loop;

public class DivisbleBy3And5 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
	}

}
