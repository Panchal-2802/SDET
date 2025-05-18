package practice_pattern_ques_with_nested_loop;

public class PrintSquareOfStar5Of5 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) { // outer loop always used to print rows
			for(int j=1; j<=5; j++) { // inner loop always used to print columns
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
