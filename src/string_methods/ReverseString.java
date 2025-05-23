package string_methods;

public class ReverseString {

	public static void main(String[] args) {
		//Approach - 1
		String s1="welcome";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.print("Reverse string by charAt(): " + rev + " ");
		System.out.println();
		
		
		// By concate method
		// Approach - 2 using concat()
		String s3 = "welcome";
		String rev3 = "";
		for (int i = s3.length() - 1; i >= 0; i--) {
		    rev3 = rev3.concat(String.valueOf(s3.charAt(i)));
		}
		System.out.print("Reverse string by using concate() & charAt() : ".concat(rev3).concat(" "));
		System.out.println();

		// Appraoch without usim\ng string method
		String s2="Hardik";
		String rev1="";
		char a[]=s2.toCharArray();
		for(int j=a.length-1; j>=0; j--) {
			//rev1=rev1+a[j];
			rev1+=a[j];
		}
		System.out.print("By converting string into array first and then print : " + rev1);
		
		//Aproach - 4 by using string buffer class
		StringBuffer s=new StringBuffer("panchal");
		System.out.println("By StringBuffer class : " + s.reverse());
		
		// Approach - 5 by using sting builder class
		StringBuilder s6=new StringBuilder("Ayushi");
		System.out.println("By stringBuilder class : " + s6.reverse());

	}

}
