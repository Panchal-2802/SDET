package array_for_loop;

public class RemoveDuplicateArrayElementAndPrintUniqueArrayElement {
// Remove duplicate and print unique value of array
	public static void main(String[] args) {
		int nums[] = {1, 2, 2, 3, 3, 3};
		int[] unique = new int[nums.length];//temp array to store data
		int k = 0;//declared variable

		for (int i = 0; i < nums.length; i++) {//i=0 1 2 3 4
		    boolean isDuplicate = false;
		    
		    for (int j = 0; j < k; j++) {//j=0
		        if (nums[i] == unique[j]) {//nums[0]==unique[0]=>1
		        	                       //nums[1]==unique[0]=>2==1
		        	                       //nums[2]==unique[2]=>2==2
		        	                      //nums[3]==unique[3]=>3
		        	                      //nums[4]==unique[4]=>3
		        	                      //nums[5]==unique[5]=>3
		            isDuplicate = true;
		            break;
		        }
		    }//j++
		    
		    if (!isDuplicate) {
		        unique[k] = nums[i];//unique[1]=nums[1]=>2
		                            //unique[3]=nums[3]=>3
		        k++;//k=1 2 3 4 5
		    }
		}//i++ 
		for (int i = 0; i < k; i++) {
		    System.out.print(unique[i] + " ");
		}
		
	}

}
