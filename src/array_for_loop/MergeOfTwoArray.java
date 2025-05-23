package array_for_loop;

import java.util.Arrays;

public class MergeOfTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,10,11,12,13};
		int b[]= {4,5,6,7,8,9};
		int temp[]=new int [a.length+b.length];
		for (int i=0; i<a.length; i++) {// i=0 1 2
			temp[i]=a[i];// temp[0]=a[0]=>1
			             // temp[1]=a[1]=>2
			  
		}//i++ 1 2
		for(int i=0; i<b.length; i++) {
			temp[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(temp));

	}

}
