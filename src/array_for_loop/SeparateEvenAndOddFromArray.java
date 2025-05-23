package array_for_loop;

import java.util.Arrays;

public class SeparateEvenAndOddFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int Even[]=new int[a.length];
		int odd[]=new int [a.length];
		int EvenIndex=0;
		int OddIndex=0;
		for(int i=0; i<a.length; i++) {//i=1
			if(a[i]%2==0) {
				Even[EvenIndex++]=a[i];// even[0+1]=a[0]=>0
				                       // even[1+1]=a[1]=>2
			}
			else {
				odd[OddIndex++]=a[i];// odd[0+1]=a[0]=>1
				                     // odd[1+1]=a[1]=>2
			}
		}//i++
		// note : Arrays.copyof(int, index) is used to trim of unused index value
		Even=Arrays.copyOf(Even, EvenIndex);
		odd=Arrays.copyOf(odd, OddIndex);
		System.out.println(Arrays.toString(Even));
		System.out.println(Arrays.toString(odd));

	}

}
