package array_for_loop;

public class FindNumberOfDuplicationInArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,36,1,1};
		int search_result =36;
		boolean status = false;
		int count=0;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==search_result) {
				count++;
			}
		}
		System.out.println("Total number of duplicate " + search_result + " are find in array : " + count);
	}

}
