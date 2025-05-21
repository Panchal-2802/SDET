package array_for_loop;

public class Practice_class {

	public static void main(String[] args) {
		/*// Ques 1 = sum of all array elements
		int[] a = {4, 7, 2, 9, 6, 1};
		int sum=0; // declared variable to store the value of sum of array element
		int Even_Count=0; // declared to store the count of even number
		int Odd_Count=0;
		for(int i=0; i<a.length; i++) { 
			sum+=a[i];	        
		}
		System.out.println("The sum of all array element : " + sum);
		
		// Ques 2 count even number in array element
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				Even_Count++;
			}
		}
		System.out.println("The total even number present in array : " + Even_Count);
		
		// Ques 3 count odd number in array element
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				Odd_Count++;
			}
		}
		System.out.println("The total odd number present in array : " + Odd_Count);
		
		
		// average of array element
		int b[]= {4,9,2,6,1,7};
		int sum1=0;// for store sum of element
		for(int i=0; i<b.length; i++) {
			sum1+=b[i];
		}
		System.out.println("The average of array element : " + (sum1/b.length));
		
		// Print array element in reverse
	     for(int i=5; i>=0; i--) {
	    	System.out.print( b[i] + " ");
	     }*/
		
		// print only even number
		int nums[] = {5, 3, 8, 6, 2, 7, 4, 1};
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {	
				System.out.print(nums[i] + " ");
			}
		}
		
		// find the min number of array element
		int min=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println(); // just to make console readable 
		System.out.println("The smallest number of array element is : " + min);
		
		// sum of alternate element in array
		int sum=0;
		for(int i=0; i<nums.length; i+=2) {// i=0 2 4 6 8
			sum+=nums[i]; // sum = sum + nums[0]= 0+5=5
			              //             nums[2]=5+8=13  
			              //             nums[4]=13+2=15
			              //             nums[6]=15+4=19
		}// i+=2 = i+2 = 0+2=2 4 6 8
		System.out.println("Alternate sum of array element : " + sum);
		
		// print element that greater than average of all element
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
