package array_for_each_loop;

public class PrintTotalNumberOfValueIn2DArray {

	public static void main(String[] args) {
		int b [][]= { {100,200},
			          {300,400},
			          {500,600}
	                };
		for(int[]x:b) {
			for(int value:x) {
				System.out.print(value + " ");
				
			}
			System.out.println();
		}
		

	}

}
