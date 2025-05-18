package while_loop;

public class DivisbleBy3And5_while_loop {
//check the number which are divisible by both 3 and 5 from 1 to 100
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%3==0 && i%5==0) {
				System.out.println("Number Divisible by 3 and 5 are : " + i );
				System.out.println(" ");
			}
			i++;
			
		}
		
	}

}
