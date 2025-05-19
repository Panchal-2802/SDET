package array_for_loop;

import java.util.Arrays;

public class PrintTotalNumberOfValueIn2DArray {

	public static void main(String[] args) {
		int b [][]= { {100,200},
		              {300,400},
		              {500,600}
                    };
		for(int r=0; r<b.length;r++) {
			for(int c=0; c<b[r].length; c++) {
				System.out.print(b[r][c] + " ");
			}
			System.out.println();
		}
		
	}

}
