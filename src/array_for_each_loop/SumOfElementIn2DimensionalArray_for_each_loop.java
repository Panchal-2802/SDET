package array_for_each_loop;

public class SumOfElementIn2DimensionalArray_for_each_loop {

	public static void main(String[] args) {
		int b [][]= { {100,200},
		              {300,400},
		              {500,600}
                    };
		int sum=0;
		for(int[] x:b) {
			for(int value:x) {
				sum+=value;
			}
		}
		System.out.println("The sum of 2d array : " + sum);

	}

}
