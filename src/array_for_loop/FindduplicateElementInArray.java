package array_for_loop;

public class FindduplicateElementInArray {

	public static void main(String[] args) {
		  int arr2[] = {3, 6, 1, 9, 3};
	        boolean isDuplicate = false;
	        int duplicate = -1;
	        for (int i = 0; i < arr2.length; i++) {//i=0
	            for (int j = i + 1; j < arr2.length; j++) {// j=1
	                if (arr2[i] == arr2[j]) { //3==6=> not equal
	                	                      //3==1=> not equal
	                	                      //3==9=> not equal
	                	                      //3==3=> its equal so its duplicate
	                    duplicate = arr2[i];
	                    isDuplicate = true;
	                    break;
	                }
	            }// j++ =>2 3 4
	            if (isDuplicate) {
	                break;
	            }
	        }

	        if (isDuplicate) {
	            System.out.println("Duplicate found: " + duplicate);
	        } else {
	            System.out.println("No duplicate found");
	        }
	}

}
