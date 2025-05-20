/*package array_for_loop;

import java.util.Arrays;

public class SortingTheNumberUsing_for_loop {

	public static void main(String[] args) {
		int a[]= {6,5,4,3,2,1};
		int after_sort=0;
		System.out.println("Before Sorting :- " + Arrays.toString(a));
		
		for(int i=5; i>=0; i--) {
			
			System.out.print(a[i]);
		}
		
	
		

	}

}*/
package array_for_loop;

import java.util.Arrays;

public class SortingTheNumberUsing_for_loop {

	public static void main(String[] args) {
		int a[] = {6, 5, 4, 3, 2, 1};
		int[] after_sort = new int[a.length]; // New array to store sorted values

		System.out.println("Before Sorting :- " + Arrays.toString(a));

		// Reverse the array using for loop and store in after_sort
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			after_sort[j] = a[i];
		}

		System.out.println("After Sorting :- " + Arrays.toString(after_sort));
	}
}

