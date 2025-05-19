package practice_for_loop;

public class MultiplicationOfTable1To10 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println("Multiplication of table " + i + ":");
			for(int j=1; j<=10;j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}//j++
		System.out.println();

	}

}
