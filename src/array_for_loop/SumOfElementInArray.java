package array_for_loop;

public class SumOfElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Length of array : " + a.length);
		int sum=0;
		for(int i=0; i<=a.length-1; i++) {// 0 1 3 4
			sum+=a[i];// sum = sum+i=0+1=1
			       // sum = sum+i = 1+1=2
			       // sum = sum+i = 2+3=5
			       // sum = sum=i = 5+4=9
		}
		System.out.println("Sum of array : " + sum);
		

	}

}
