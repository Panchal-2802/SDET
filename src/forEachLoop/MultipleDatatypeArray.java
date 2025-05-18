package forEachLoop;

public class MultipleDatatypeArray {

	public static void main(String[] args) {
		Object a[]= {100,"hardik",'A',10.145,10.5555888888888};
		System.out.println(a[4]);
		
		for(Object x:a) {
			System.out.print(x+" ");
		}
		//System.out.println();

	}

}
