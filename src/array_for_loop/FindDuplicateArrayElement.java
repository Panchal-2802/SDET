package array_for_loop;

public class FindDuplicateArrayElement {
// find duplicate element in array and print duplicate element as output
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 2, 4, 5, 1};
		for (int i = 0; i < arr.length; i++) {//i=0; 0<7
            boolean isDuplicate = false;  // Step 1: Reset the flag for every new i

            // Step 2: Check if arr[i] was already checked before
            for (int j = 0; j < i; j++) {//j=0; 0<0
                if (arr[i] == arr[j]) {
                    isDuplicate = true;  // Mark as already checked
                    break;               // No need to continue inner loop
                }
            }

            if (isDuplicate) {
                continue;  // Skip this iteration of outer loop if already printed
            }

            // Step 3: Check if arr[i] occurs again later in the array
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    System.out.print(arr[i] + " ");  // Found duplicate
                    break;  // Stop after printing once
                }
            }
        }
	}

}
