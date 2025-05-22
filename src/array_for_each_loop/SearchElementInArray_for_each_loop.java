package array_for_each_loop;

public class SearchElementInArray_for_each_loop {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,4};
		int search_element=4;
		boolean status = false;
		for(int x:a) {
			if(x==search_element) {
				System.out.println("Element found in an array : " + x);
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found in array : " + search_element);
		}

	}

}
