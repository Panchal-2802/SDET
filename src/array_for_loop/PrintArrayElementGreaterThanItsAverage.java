package array_for_loop;

public class PrintArrayElementGreaterThanItsAverage {

	public static void main(String[] args) {
		int nums[] = {5, 3, 8, 6, 2, 7, 4, 1};
        double sum2=0;
		for(int i=0; i<nums.length; i++) {
			sum2+=nums[i];
		}
		double avg=sum2/nums.length;
		System.out.println("Average of array element : " + avg);
		System.out.print("Number greater than average value are : ");
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>avg) {
				System.out.print(nums[i]+" ");
			}
		}

	}

}
