package array_for_each_loop;

public class CountEvenAndOddNumberInArrayElement_for_each_loop {

	public static void main(String[] args) {
		int a[]= {3,6,7,8,10};
		int Even_Count=0;
		int Odd_Count=0;
		String Even_num="";
		String Odd_num="";
		for(int x:a) {
			if(x%2==0) {
				Even_Count++;
				Even_num+=x+" ";
			}
			else {
				Odd_Count++;
				Odd_num+=x+" ";
			}
		}
		System.out.println("The even number found in array are " + Even_Count + " With number of " + Even_num);
		System.out.println("The odd number found in array are " + Odd_Count + " With number of " + Odd_num);

	}

}
