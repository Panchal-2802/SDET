package array_for_loop;

public class CheckSpecificNumberExistInArray_linear_search {

	public static void main(String[] args) {
		int a[]= {4, 2, 7, 9, 1};
		int search_element=7;
		boolean status = false;
		for(int i=0; i<a.length; i++) {
			if(a[i]==search_element) {
				System.out.println("Yes element found in array : " + search_element);
				status=true;
				break;
			}
			
		}
		if(status==false) {
			System.out.println("Element not found in array : " + search_element);
		}

	}

}
