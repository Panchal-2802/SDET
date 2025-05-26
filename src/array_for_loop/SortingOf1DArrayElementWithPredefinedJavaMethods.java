package array_for_loop;

import java.util.Arrays;

public class SortingOf1DArrayElementWithPredefinedJavaMethods {

	public static void main(String[] args) {
		int a[]= {6,4,5,3,2,1};
		System.out.println("before sorting :- " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting :- " + Arrays.toString(a));
		
		/*int b[]= {5,2,8,7,1};
		System.out.print("Original Array : " );
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
			
			int temp=0;
			for(int j=0; j<b.length; j++) {
				for(int k=j+1; k<b.length; k++) {
					if(b[j]<b[i]) {
						temp = b[i];
						b[i]=b[j];
						b[j]=temp;
					}
				}
			}
		}
		System.out.print("sorted array : " );
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");

	}*/

}
}
