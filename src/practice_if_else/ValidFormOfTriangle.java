package practice_if_else;

public class ValidFormOfTriangle {

	//rule :- sum of any two side should be greater to make a triangle
	public static void main(String[] args) {
		float side1 = 10.00f, side2 = 10.50f, side3 = -10.00f;
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)){
			System.out.println("The given value of side are valid to make a triangle");
		}
		else {
			System.out.println("Sides are invalid to make triangle");
		}
	}

}
