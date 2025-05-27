package array_for_loop;

public class DuplicateArrayElement_final_version {
	/*You are given an array of integers. Print all the elements that occur more than once.
	Input: {1, 2, 3, 2, 4, 5, 1}
	Output: 1 2
	Youtube :- https://www.youtube.com/watch?si=q2qpAIqIBy0KDAQa&v=X_NfqtyG4Bs&feature=youtu.be
	Note this solution help only to find two duplicate element not more than that
	*/
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 2, 4, 5, 1,};
		boolean isDuplicate=false;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
				  System.out.print(a[i]+",");
					isDuplicate=true;
				}
			}
		}
		if(isDuplicate==false) {
			System.out.println("No duplicate element found");
		}
   }
}
