package array_for_loop;

public class SumOfElementIn2DimensionalArray {

	public static void main(String[] args) {
		int b [][]= { {100,200},
			          {300,400},
			          {500,600}
	                };
		int sum=0;
		for(int r=0; r<b.length; r++) {
			for(int c=0; c<b[r].length; c++) {
				sum+=b[r][c];
			}
		}
		System.out.println(sum);

	}

}
