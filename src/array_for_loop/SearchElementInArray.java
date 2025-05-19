package array_for_loop;

public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int search_element = 8;
		boolean status=false;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==search_element) {
				System.out.println("Element is found in an array : " + i);
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element is not found in an array : " + search_element);
		}

	}

}
