package array_for_loop;

import java.util.Arrays;

public class SortingOf1DArrayElementOfStringsWithPredefinedJavaMethods {

	public static void main(String[] args) {
		Object a[]= {"hardik","panchal","tushar","dwayne"};
		System.out.println("before sorting : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting : " + Arrays.toString(a));

	}

}
