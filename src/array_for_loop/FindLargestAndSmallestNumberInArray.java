package array_for_loop;

public class FindLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int[] a = {5, 2, 9, 1, 6};
		int max=a[0];
		int min=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) { // a[1]=2>5 -- no
				max=a[i]; // max=a[1]=2
			}
			else if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("largest number is : " + max);
		System.out.println("Minimum number is : " + min);

	}

}
