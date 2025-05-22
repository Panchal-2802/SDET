package array_for_loop;

public class SumOfAlternateArrayElement {

	public static void main(String[] args) {
		int nums[] = {5, 3, 8, 6, 2, 7, 4, 1};
		int sum=0;
		for(int i=0; i<nums.length; i+=2) {// i=0 2 4 6 8
			sum+=nums[i]; // sum = sum + nums[0]= 0+5=5
			              //             nums[2]=5+8=13  
			              //             nums[4]=13+2=15
			              //             nums[6]=15+4=19
		}// i+=2 = i+2 = 0+2=2 4 6 8
		System.out.println("Alternate sum of array element : " + sum);

	}

}
