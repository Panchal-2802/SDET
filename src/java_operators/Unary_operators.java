package java_operators;

public class Unary_operators {

	public static void main(String[] args) {
		//case 1
		int a = 10;
		a=a+1;
		System.out.println(a);
		
		//case 2
		int b = 11; b++; //post increment
		System.out.println(b);
		
		//case 3
		int c = 12; 
		int res = c++; // post increment
		System.out.println(res);
		System.out.println(c);
		
		//case 4
		int d = 13;
		int res1 = ++d; // pre increment
		System.out.println(res1);
		System.out.println(d);
		
		//case 5
		int e = 14;
		int res2 = --e; // pre decrement
		System.out.println(res2);
		System.out.println(e);
		
		//case 6
		int f = 15;
		int res3 = f--; // post decrement
		System.out.println(res3);
		System.out.println(f);

	}

}
