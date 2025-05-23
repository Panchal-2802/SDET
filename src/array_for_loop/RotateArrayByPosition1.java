package array_for_loop;

public class RotateArrayByPosition1 {

	public static void main(String[] args) {
	     int arr3[]={1, 2, 3, 4, 5}; // output : {5,1,2,3,4}
	        int temp=arr3[4];
	        for(int i=arr3.length-1; i>0; i--) {
	        	arr3[i]=arr3[i-1];
	        }
	        arr3[0]=temp;
	        System.out.print("Rotate version of array : ");
	        for(int x:arr3) {
	        	System.out.print(x+" ");
	        }
	}

}
