package array_for_loop;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 2, 3, 4, 4, 5};   // original array with duplicates
        int temp[] = new int[a.length];         // create a new array to store unique values
        int index = 0;  
                                             // index for temp[] to track where to insert

        for (int i = 0; i <a.length; i++) {     // outer loop goes through original array
        	boolean isDuplicate = false;      // flag to check if element already exists in temp[]

            for (int j = 0; j < index; j++) { // j=0 & index=0
            	                              // j=0 & index=1  
            	                              // j=0 & index=2
                if (a[i] == temp[j]) {        //a[1]==temp[0] = 2==1 which is not duplicate
                	                          //a[2]==temp[0] = 2==1
                	                         
                    isDuplicate = true;         
                    break;                     
                }
            }//j++

            if (!isDuplicate) {                
                temp[index] = a[i];   // temp[0]=a[0]=1  
                                      // temp[1]=a[1]=2
                                      // index = 1 2
                index++;                     
            }
        }//i++ = 1,2

        // Print the final array without duplicates
        System.out.print("Unique elements: ");
        for (int i = 0; i < index; i++) {
           System.out.print(temp[i] + " ");
        }
    }
}
