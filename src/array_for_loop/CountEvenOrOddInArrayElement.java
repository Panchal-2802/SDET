package array_for_loop;

import java.util.Arrays;

public class CountEvenOrOddInArrayElement {

	public static void main(String[] args) {
		int a[]= {3,6,7,8,10};
		int Even_Count=0;
		int Odd_count=0;
		String Even_num="";
		String Odd_num="";
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				Even_Count++;
				Even_num+=a[i] + " ";
			}
			else {
				Odd_count++;
				Odd_num+=a[i] + " ";
			}
		}
		System.out.println("Total even number are found in array element is " + Even_Count + " With the number of " + Even_num);
		System.out.println("Total odd number present in array element : " + Odd_count + " With the number : " + Odd_num);
       // approach - 2 only odd number
		int[] nums = {5, 3, 8, 6, 2, 7, 4, 1}; //8
		int count=0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]%2!=0) {
				count++;
			}
		}
		System.out.println("The total count of odd number is : " + count);
		
		// approach - 2 on;y even number
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {	
				System.out.print(nums[i] + " ");
			}
		}
	}

}
