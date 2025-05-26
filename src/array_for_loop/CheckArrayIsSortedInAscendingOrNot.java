package array_for_loop;

public class CheckArrayIsSortedInAscendingOrNot {
// ascending order means small to big like 0,1,2,3,4,5
	public static void main(String[] args) {
		int nums1[]= {1,2,3,4,5};
		boolean isSorted=true;
		for(int i=0; i<nums1.length-1; i++) {
			if(nums1[i]>nums1[i+1]) { // nums1[0]>nums1[0+1]=> 1>2
				isSorted=false;
				break;
			}
			
		}
		if (isSorted)
		    System.out.println("Array is sorted in ascending order.");
		else
		    System.out.println("Array is NOT sorted in ascending order.");
		
		// Approach - 2
		// check whether array is desending or ascending
		
		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 0; i < nums1.length - 1; i++) {
		    if (nums1[i] > nums1[i + 1]) {// nums1[0]>nums1[0+1]=>1>2
		        isAscending = false;
		    }
		    if (nums1[i] < nums1[i + 1]) { // nums1[0]<nums[0+1]=>1<2
		        isDescending = true;
		    }
		}

		if (isAscending)
		    System.out.println("Array is sorted in ascending order.");
		else if (isDescending)
		    System.out.println("Array is sorted in descending order.");
		else
		    System.out.println("Array is NOT sorted.");


	}

}
