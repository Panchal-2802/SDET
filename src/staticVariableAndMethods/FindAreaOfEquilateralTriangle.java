package staticVariableAndMethods;

public class FindAreaOfEquilateralTriangle {

	public static void main(String[] args) {
	    AreaOfTriangle(50,50,50);
		FindAreaOfEquilateralTriangle obj1 = new FindAreaOfEquilateralTriangle();
		obj1.AreaOfTriangle2(20, 20, 20);

	}
	// by static method
	public static boolean validateDimension(int side1, int side2, int side3) {
		return side1==side2 && side2==side3 && side3==side1;
	}
	
	static void AreaOfTriangle(int side1, int side2, int side3) {
		if(validateDimension(side1, side2, side3)) {
			int areaofequilateraltriangle = side1*side2*side3;
			System.out.println("The area of triangle by static method is : " + areaofequilateraltriangle);
		}
		else {
			System.out.println("Any of the two side are not same");
		}
	}
	public void AreaOfTriangle2(int side2, int side3, int side1) {
		if(validateDimension(side1,side2,side3)) {
			int area = side1*side2*side3;
			System.out.println("The area of triangle by non - static method : " + area);
		}else {
			System.out.println("Enter a valid side value");
		}
	}

}
