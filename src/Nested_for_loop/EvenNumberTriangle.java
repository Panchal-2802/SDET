package Nested_for_loop;

public class EvenNumberTriangle {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((j*2)+" ");
			}
			System.out.println();
		}
		

	}

}
