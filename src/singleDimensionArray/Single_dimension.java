package singleDimensionArray;
/*Declarung array & assigment value to array
 * find lenght of an array
 * read specific value for array
 * read all the value from array by looping statement
 * */
public class Single_dimension {

	public static void main(String[] args) {
		//declaring an array
		//approach - 1
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// approach - 2
		int b[]= {100,200,300,400,500};
		
		// to print lenght of an array with predefined java method
		System.out.println("The lenght or size of array a[] : " + a.length);
		System.out.println("The lenght or size of array b[] : "+ b.length);
		
		// read specific value from an array
		System.out.println(b[3]);
		
		// print by using for loop
		for(int i=0; i<=4; i++) {
			System.out.println("The value of array are : " + a[i]);
		}
		/* how put condition while using for loop
		 * for example 
		 * i<5, i<=4, i<=a.lenght-1, i<a.length
		 * Note:- a.length is gives the total snumber of value in array
		 */

	}

}
