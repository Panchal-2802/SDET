package array_for_each_loop;

public class FindNumberOfDuplicationInArray_for_each_loop {

	public static void main(String[] args) {
		int a[]= {1,2,1,3,4,1,1,1};
		int search_result=1;
		int count=0;
		for(int x:a) {
			if(x==search_result) {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
