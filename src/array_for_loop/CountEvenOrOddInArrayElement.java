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

	}

}
