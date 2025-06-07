package staticVariableAndMethods;

public class SumOfTwoNumber {
	
	

	public static void main(String[] args) {
		SumOfNum(10,20);
		SumOfTwoNumber obj1 = new SumOfTwoNumber();
		obj1.SumOfNum2(10, 40);
		
		

	}
	
	// by static method 
	public static boolean validateDimension(int a , int b) {
		return a!=b && a>0 && b>0;
		
	}
	public static void SumOfNum(int a, int b) {
		if(validateDimension(a,b)) {
			int sum = a+b;
			System.out.println("The sum of two number by static method is : " + sum);
		}
		else {
			System.out.println("Enter Invalid number");
		}
	}
	
	// non - static method
	void SumOfNum2(int a, int b) {
		if(validateDimension(a,b)) {
			int sum2=a+b;
			System.out.println("The sum of two number by non - static method is : " + sum2);
		}
		else {
			System.out.println("enter valid number");
		}
	}

}
