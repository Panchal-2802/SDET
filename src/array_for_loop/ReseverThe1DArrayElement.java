package array_for_loop;

import java.util.Arrays;

public class ReseverThe1DArrayElement {

	public static void main(String[] args) {
		int a[]= {6,5,4,3,2,1};
		for(int i=5; i>=0; i--) {
			System.out.print(a[i]);
		}
		
		// approach - 2 
		int nums1[]= {1,2,3,4,5};
		System.out.print("The reverse of " + Arrays.toString(nums1)+" array element are :");
		for(int i=4; i>=0; i--) {
			System.out.print(nums1[i]+" ");
		}
		
	}

}
