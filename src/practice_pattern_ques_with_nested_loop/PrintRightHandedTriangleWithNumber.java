package practice_pattern_ques_with_nested_loop;

public class PrintRightHandedTriangleWithNumber {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}//j++
			System.out.println();
		}//i++
		System.out.println();
	/*	
		1
		22
		333
		4444
		55555
		Jyare column ni row ni andar same number repeat thato hoy
		tyare outer column no variable print karavano */

		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		

	}

}
/*
  1
  12
  123
  1234
  12345
-- Jayare rows ni andar value increase thati jaai tyare hamesa inner loop 
variable print karvano */