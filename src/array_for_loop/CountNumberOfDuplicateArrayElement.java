package array_for_loop;

public class CountNumberOfDuplicateArrayElement {

	public static void main(String[] args) {
		int a[]= {1,1,2,36,1,1};
		int search_result =1;
		int count=0;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==search_result) {
				count++;
			}
		}
		if (count > 0) {
            System.out.println(search_result + " appears " + count + " time(s) in the array.");
        } else {
            System.out.println(search_result + " is not found in the array.");
        }
	}

}
