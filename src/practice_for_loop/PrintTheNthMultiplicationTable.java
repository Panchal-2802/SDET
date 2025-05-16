package practice_for_loop;

public class PrintTheNthMultiplicationTable {

	public static void main(String[] args) {
		int n=7;
		System.out.println("Multiplication of table : " + n);
		for(int i=1; i<=10; i++) {
			
			System.out.println(n + " x " + i + " = " + (n * i));
			/*for(int j=1; j<=10; j++) {
				System.out.println(n + " x " + j + " = " + (i*j));
			}*/
		}

	}

}
