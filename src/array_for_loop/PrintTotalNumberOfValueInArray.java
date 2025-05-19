package array_for_loop;

import java.util.Arrays;

public class PrintTotalNumberOfValueInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,8,8,9,3};
		System.out.print("Print the whole value of array by java predefined method : ");
		System.out.print(Arrays.toString(a));
		System.out.println();
		for(int i=1; i<=a.length-1; i++) {
			System.out.println(i + " ");
		}

	}

}
