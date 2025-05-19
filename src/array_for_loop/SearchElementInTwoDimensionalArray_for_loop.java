package array_for_loop;

public class SearchElementInTwoDimensionalArray_for_loop {
	/*   |  0       1 // this represent no. of column
    -----|-------------
     0-- | 100      200 // this represent no.of rows
 *   1-- | 300      400
 *   2-- | 500      600
 */
	public static void main(String[] args) {
		int a[][]= {{100,100},
				    {200,400},
				    {300,300}
		           };
		int search_result = 500;
		boolean status = false;
		for(int r=0; r<a.length; r++ ) {
			for(int c=0;c<a[r].length;c++ ) {
				if (a[r][c]==search_result) {
					System.out.println("Element found in array " + search_result);
					status=true;
					break;
				}
			}
		}
		if(status==false) {
			System.out.println("Element not found in array : " + search_result);
		}

	}

}
