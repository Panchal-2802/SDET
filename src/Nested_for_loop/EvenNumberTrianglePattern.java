package Nested_for_loop;

public class EvenNumberTrianglePattern {
/*	2
	2 4
	2 4 6
	2 4 6 8
	2 4 6 8 10*/
	
	public static void main(String[] args) {
		/*int num = 2;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print( (j*2) + " ");
			}
			System.out.println();
		}
		
		
		// Outer loop for rows
				for (int i = 1; i <= 5; i++) {
					// Inner loop for even numbers starting from 2
					for (int j = 1; j <= i; j++) {
						System.out.print((j * 2) + " ");
					}
					System.out.println(); // move to next line after each row
				}
				*/
				// Outer loop for the table number (1 to 10)
				for (int i = 1; i <= 10; i++) {
					System.out.println("Multiplication Table of " + i + ":");
					
					// Inner loop for multiplying 1 to 10
					for (int j = 1; j <= 10; j++) {
						System.out.println(i + " x " + j + " = " + (i * j));
					}
					
					System.out.println(); // blank line between tables
				}
			}

	 }


