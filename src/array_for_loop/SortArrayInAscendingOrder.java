package array_for_loop;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
/*Sort an integer array in ascending order without using any Java built-in sort method.
Input: {4, 2, 7, 1, 3}
Output: {1, 2, 3, 4, 7}*/
	public static void main(String[] args) {
		int arr[]= {4, 2, 7, 1, 3};
		int temp=0;
		System.out.print("Unsorted array or original array : " + Arrays.toString(arr));
		/*for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}*/
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.print("\nSorted array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

  }
}
