package array_for_each_loop;

public class SumAndAverageOfArrayElement_for_each_loop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		System.out.println("The sum of array element : " + sum);
		System.out.println("The avg of array element : " + (sum/a.length));

	}

}
