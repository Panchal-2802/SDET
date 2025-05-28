package array_for_loop;

import java.util.Arrays;

public class MovingArrayElementZeroToEnd_interview {
	/*Given an array, move all 0s to the end while maintaining the order of other elements.
	Input: {1, 0, 2, 0, 3, 4}
	Output: {1, 2, 3, 4, 0, 0}*/
	public static void main(String[] args) {
		int arr[]= {1, 0, 2, 0, 3, 4};
		int temp[]=new int [arr.length];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				temp[index]=arr[i];
				index++;
			}
			
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		
		}

	}

}
