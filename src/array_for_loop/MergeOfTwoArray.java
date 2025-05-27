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
			             // temp[2]=a[2]=>3
			             // temp[3]=a[3]=>10
			             // temp[4]=a[4]=>11
			             // temp[5]=a[5]=>12
			            // temp[6]=a[6]=>13
		}//i++ 1 2 3 4 5 6 7
		for(int i=0; i<b.length; i++) {//i=0
			temp[a.length+i]=b[i];//temp[7+0]=b[0]=>4
			                      //temp[7+1]=b[1]=>5
			                      //temp[7+2]=b[2]=>6
			                      //temp[7+3]=b[3]=>7
			                      //temp[7+4]=b[4]=>8
			                      //temp[7+5]=b[5]=>9
		}//i++ 1 2 3 4 5 6
		System.out.println(Arrays.toString(temp));

	}

}
