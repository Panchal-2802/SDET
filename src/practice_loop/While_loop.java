package practice_loop;

public class While_loop {

	public static void main(String[] args) {
		// approach 1 
		int i = 2;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
		// aprraoch 2 
		
		int a=1;
		while(a<=10) {
			if(a%2==0) {
				System.out.println("Even Number : " + a);
			}
			else {
				System.out.println("Odd Number : " + a);
			}
			a++;
		}

	}

}
