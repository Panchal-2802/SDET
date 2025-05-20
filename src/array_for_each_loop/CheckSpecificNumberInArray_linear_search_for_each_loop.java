package array_for_each_loop;

public class CheckSpecificNumberInArray_linear_search_for_each_loop {

	public static void main(String[] args) {
		int a[]= {4, 2, 7, 9, 1};
		int search_element=70;
		boolean status = false;
		for(int x:a) {
			if(x==search_element) {
				System.out.println("Yes element found in array : " + search_element);
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("element not found in array : " + search_element);
		}

	}

}
