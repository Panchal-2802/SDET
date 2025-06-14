package array_for_loop;

public class Dummy {

	public static void main(String[] args) {
		 int arr1[] = {1, 2, 2, 3, 3, 3};

	        for (int i = 0; i < arr1.length; i++) {
	            int count = 0;

	            // ✅ Only check for duplicates before current index
	            boolean isCounted = false;
	            for (int k = 0; k < i; k++) {
	                if (arr1[i] == arr1[k]) {
	                    isCounted = true;
	                    break;
	                }
	            }

	            // ✅ Count only if not already counted
	            if (!isCounted) {
	                for (int j = 0; j < arr1.length; j++) {
	                    if (arr1[i] == arr1[j]) {
	                        count++;
	                    }
	                }
	                System.out.println(arr1[i] + " appears " + count + " time" + (count > 1 ? "s" : ""));
	            }
	        }
	    }
}
