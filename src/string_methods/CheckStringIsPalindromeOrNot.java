package string_methods;

public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {
		// Appraoch - 1
		String s1="Bob";
		String rev="";
		System.out.println(s1.length());
		for(int i=s1.length()-1; i>=0; i--) {
			rev+=s1.charAt(i);// rev = rev+s1.charAt(2)=> rev=b
			                  // rev = rev+s1.charAt(1)=> rev=bo
			                  // rev = rev+s1.chartAt(0)=> rev=boB
		}//i-- 1 0
		System.out.println("By charAt Method");
		System.out.println("-----------------");
		System.out.println("Reverse string : " + rev);
		if(s1.equals(rev)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		System.out.println();
		
		// Aprroach - 2
		String rev2="";
		char a[]=s1.toCharArray();
		for(int i=a.length-1; i>=0; i--) {
			rev2+=a[i];
		}
		System.out.println("By converting string to array");
		System.out.println("-----------------------------");
		System.out.println("Reverse string :" + rev2);
		if(s1.equalsIgnoreCase(rev2)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		System.out.println();
		
		// appraoch - 3
		StringBuffer s2 = new StringBuffer("mam");
		StringBuffer rev3=s2.reverse();
		System.out.println("By StringBuffer method");
		System.out.println("----------------------");
		System.out.println("Reverse String : " + rev3);
		if(s2.equals(rev3)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The given string is not palindrome");
		}
		System.out.println();
		
		//aproach - 4
		StringBuilder s3 = new StringBuilder("mam");
		StringBuilder rev4=s3.reverse();
		System.out.println("By StringBuilder method");
		System.out.println("----------------------");
		System.out.println("Reverse String : " + rev4);
		if(s3.equals(rev4)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The given string is not palindrome");
		}
		
	}

}
