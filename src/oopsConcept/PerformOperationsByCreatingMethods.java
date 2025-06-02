package oopsConcept;

public class PerformOperationsByCreatingMethods {

	public int A;
	public int B[];
	public void findEvenOrOdd() {
		if(A%2==0) {
			System.out.println("Even Number : " + A);
		}
		else {
			System.out.println("Odd Number : " + A);
		}
	}
	public void ArrayEvenOrOdd() {
		int evennumber;
		int oddnumber;
		for(int i=0; i<B.length; i++) {
		if(B[i]%2==0) {
			System.out.println("Even Number From array : " + B[i]);
		}
		else {
			System.out.println("Odd Number from array  : " + B[i]);
			}
		}
	}
	public static void main(String[] args) {
		PerformOperationsByCreatingMethods obj1 = new PerformOperationsByCreatingMethods();
		//int Arr[]= {1,2,4,5,5,7,8,6,9};
		obj1.A=24;
		obj1.findEvenOrOdd();
		obj1.B= new int[] {1,2,4,3,5,6,9,8};
		obj1.ArrayEvenOrOdd();

	}

}
