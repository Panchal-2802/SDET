package array_for_loop;

public class PrintElemenrOfArrayInReverseOrder {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5};
		String Reverse_num="";
		for(int i=a.length-1; i>=0; i--) {
			Reverse_num+=a[i]+" ";
		}
		System.out.println("Reverse element of array are : " + Reverse_num);

	}

}
