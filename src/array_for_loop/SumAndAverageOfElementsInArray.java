package array_for_loop;

public class SumAndAverageOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println("The sum of array element : " + sum);
		System.out.println("The average of array element : " + (sum/a.length));

	}

}
