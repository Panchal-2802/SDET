package array_for_loop;

public class CountTotalNumberOfEvenAndOddFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int evencount=0;
		int oddcount=0;
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			
		}
		System.out.println("The total even number in an array : " + evencount);
		System.out.println("The total odd number in an array : " + oddcount);

	}

}
