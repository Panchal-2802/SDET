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
//			else if(a[i]<min){
//				min=a[i];
//			}
		}
		System.out.println("largest number is : " + max);
		//System.out.println("Minimum number is : " + min);
		
		// approach - 2 find only min number
		int nums[] = {5, 3, 8, 6, 2, 7, 4, 1};
		int min1=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min1) {
				min1=nums[i];
			}
		}
		System.out.println(); // just to make console readable 
		System.out.println("The smallest number of array element is : " + min1);

	}
	

}
