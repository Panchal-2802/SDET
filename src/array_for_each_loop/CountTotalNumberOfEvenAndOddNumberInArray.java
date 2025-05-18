package array_for_each_loop;

public class CountTotalNumberOfEvenAndOddNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int evencount=0;
		int oddcount=0;
		for(int x:a) {
			if(x%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Total even number in an array : " + evencount);
		System.out.println("Total odd number in an array : " + oddcount);

	}

}
