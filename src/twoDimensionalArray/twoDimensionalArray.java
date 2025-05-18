package twoDimensionalArray;

public class twoDimensionalArray {
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
		 
		 // find the size of two dimensional array
		 System.out.println("The number of rows : " + a.length);
		 System.out.println("The number of columns : " + a[0].length); // this used to go to first for specific row and then count no of col from their
		 
		 // read specific value from row
		 //System.out.println(b[2][1]);
		 
		 // read all rows and column values
		 // approach  - 1
		 /*for(int r=0;r<=2;r++) { // outer loop represnt always row value
			 for(int c=0; c<=1; c++) { // inner loop always represnt column value
				 //System.out.print(a[r][c] + " ");
				 System.out.print(a[r][c]+" "); // to print output in tabular format
			 }
			 System.out.println();
		 }*/
		 
		 // approach - 2
		 for(int r=0;r<=a.length-1;r++) { // outer loop represnt always row value
			 for(int c=0; c<=a[r].length-1; c++) { // inner loop always represnt column value
				 //System.out.print(a[r][c] + " ");
				 System.out.print(a[r][c]+" "); // to print output in tabular format
			 }
			 System.out.println();
		 }
	}
		
}

	


