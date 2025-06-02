package oopsConcept_2;
import oopsConcept.PerformOperationsByCreatingMethods; // packageName.className
public class FindEvenOdd {

	public static void main(String[] args) {
		PerformOperationsByCreatingMethods obj1 = new PerformOperationsByCreatingMethods();
		obj1.A=39;
		obj1.findEvenOrOdd();
		obj1.B=new int[] {2,5,4,7,8,6,3,2};
		obj1.ArrayEvenOrOdd();
	}

}
