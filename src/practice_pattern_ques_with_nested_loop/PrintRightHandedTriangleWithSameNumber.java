package practice_pattern_ques_with_nested_loop;

public class PrintRightHandedTriangleWithSameNumber {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
