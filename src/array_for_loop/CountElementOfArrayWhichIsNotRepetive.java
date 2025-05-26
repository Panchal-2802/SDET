package array_for_loop;

public class CountElementOfArrayWhichIsNotRepetive {

	public static void main(String[] args) {
int[] nums = {1, 2, 3, 2, 1};
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Number that appears only once: " + nums[i]);
                break; // We can break the loop because question says "only one such number"
            }
        }
    }
}

