package forEachLoop;

public class TwoDimensionalArray {
	/*   |  0       1 // this represent no. of column
    -----|-------------
     0-- | 100      200 // this represent no.of rows
 *   1-- | 300      400
 *   2-- | 500      600
 */

	public static void main(String[] args) {
		// declaring array
				int a[][] = new int [3][2]; // first [] defines :- for row
				                            // second [] defines :- column
				/* different pattern to declare array 
				 * int [][]a = new int [3][2];
				 * int []a[]=new int [3][2]
				 */
				
				// assinging value tow array
				
				 a[0][0]=100;                                 
				 a[0][1]=200;
				 
				 a[1][0]=300;
				 a[1][1]=400;
				 
				 a[2][0]=500;
				 a[2][1]=600;
				 
				 // approach - 2
				 int b [][]= { {100,200},
						       {300,400},
						       {500,600}
				             };
				 /* Note:- here arr1 represnt a variable which store the value in it
				  * b:- is represent the whole row of array like b[0][0] and b[0][1] 
				  * x:- is represent a variable that used to store the value of arr1
				  * */
				 
				 for(int arr1[]:b) { 
					 for(int x:arr1) {
						 System.out.print(x + " ");
					 }
					 System.out.println();
				 }

	}

}
