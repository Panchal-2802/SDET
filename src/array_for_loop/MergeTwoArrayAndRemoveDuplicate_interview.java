package array_for_loop;

import java.util.Arrays;

public class MergeTwoArrayAndRemoveDuplicate_interview {
	/*arr1 = {1, 2, 3, 4}
	arr2 = {3, 4, 5, 6}
	Output: {1, 2, 3, 4, 5, 6}*/
	public static void main(String[] args) {
		int arr1[]={1, 2, 3, 4},arr2[]={3, 4, 5, 6};
		int temp[]=new int[arr1.length+arr2.length];
		System.out.println("----Merging of two arrays----");
		for(int i=0; i<arr1.length; i++) {
			temp[i]=arr1[i];
		}
		for(int i=0; i<arr2.length;i++) {
			temp[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(temp));
		
		System.out.println("Removing duplicates");
		for(int i=0; i<temp.length; i++) {
			boolean isDuplicate=false;
			for(int j=i+1; j<temp.length;j++) {
				if(temp[i]==temp[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(temp[i]+" ");
		}


	}

}
}
