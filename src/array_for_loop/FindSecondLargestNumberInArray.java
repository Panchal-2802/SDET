package array_for_loop;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int b[]= {4,9,2,6,1,7,10,11};
		int max=b[0];
		int second_max=b[0];
		for(int i=0; i<b.length; i++) {
			if(b[i]>max) {
				max=b[i];
			}
		}
		System.out.println("The max element of array is : " + max);
		for(int i=0; i<b.length;i++) {
			if(b[i] != max && b[i]>second_max ) {
				second_max=b[i];
			}
		}
		System.out.println("The second max element of array is : " + second_max);
		
		// approach - 2
		int a[]= {4,9,2,6,1,7,10};
		int max1=a[0];
		int sec_max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max1) {
				sec_max=max1;
				max1=a[i];
			}
			else if(a[i]>sec_max && a[i]!=max1) {
				sec_max=a[i];
			}
		}
		System.out.println("The second max element by approach - 2 : " + sec_max);
	}

}
