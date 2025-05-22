package array_for_loop;

import java.util.Arrays;

public class SortingOf1DArrayElementWithPredefinedJavaMethods {

	public static void main(String[] args) {
		int a[]= {6,4,5,3,2,1};
		System.out.println("before sorting :- " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting :- " + Arrays.toString(a));

	}

}
