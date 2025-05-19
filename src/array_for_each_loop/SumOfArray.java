package array_for_each_loop;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum=0;
		for(int x:a) {
			sum+=x;// 0+1=1
			       //1+2=3
			       //3+3=6
			       //6+4=10
			       //10+5=15
		}
		System.out.println("The sum of array is : " + sum);

	}

}
