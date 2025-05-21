package array_for_loop;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int b[]= {4,9,2,6,1,7,10};
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
	}

}
