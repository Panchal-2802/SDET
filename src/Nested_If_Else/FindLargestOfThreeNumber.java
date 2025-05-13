package Nested_If_Else;

public class FindLargestOfThreeNumber {

	public static void main(String[] args) {
		int a = 20, b = 20, c = 20;
		
	/*	// the below code is used as simple if else version
		if(a>b && a>c) {
			System.out.println("A is greater than both B & C");
		}
		else if (b>a && b>c) {
			System.out.println("B is greater than both A & C");
		}
		else if (c>a && c>b) {
			System.out.println("C is greater than both A & B");
		}
		else {
			System.out.println("All three number are equal");
		}
*/
		
		// Nested if else method
		 if (a >= b) {
	            if (a >= c) {
	                System.out.println("A is the largest or equal to others");
	            } else {
	                System.out.println("C is the largest");
	            }
	        } else {
	            if (b >= c) {
	                System.out.println("B is the largest or equal to others");
	            } else {
	                System.out.println("C is the largest");
	            }
	        }

	        if (a == b && b == c) {
	            System.out.println("All three numbers are equal");
	        }
	    }
	}


