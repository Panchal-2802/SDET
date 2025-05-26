package array_for_loop;

import java.util.Arrays;

public class Practice_class {

	public static void main(String[] args) {
// day - 7  Reverse array without using another array 
		int arr[]= {1,2,3,4,5};
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
		//  Find Difference Between Max and Min in Array
		int arr1[]= {10, 5, 20, 1};
		int max=arr1[0];
		int min=arr1[0];
		for(int i=0; i<arr1.length; i++) {//i=0,
			if(arr1[i]>max) {//20>10
				max=arr1[i];// max=arr1[0]=10
				            //     arr1[1]=5 !>10 therefore max = 10
			}
			else if(arr1[i]<min) {
				min=arr1[i];// mix=arr1[0]=10
				            // min=arr1[1]=5
			}
		}//i++ 1
		System.out.println("The max value : " + max);
		System.out.println("The min value : " + min);
		System.out.println("difference betwen " + max + " and " + min + " : " +(max-min));
		
		// count even or odd from array element
		int a[]= {2, 5, 7, 8, 10, 13};
		int evencount=0;
		int oddcount=0;
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}	
		}
		System.out.println("The total even number in an array : " + evencount);
		System.out.println("The total odd number in an array : " + oddcount);
	}
}
