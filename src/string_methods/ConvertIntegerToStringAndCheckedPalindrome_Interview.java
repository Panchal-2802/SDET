package string_methods;

public class ConvertIntegerToStringAndCheckedPalindrome_Interview {

	public static void main(String[] args) {
		int s1=123;
		String s2=Integer.toString(s1);
		String temp[]=s2.split("");
		String revResult="";
		for(int i=temp.length-1; i>=0; i--) {
			revResult+=s2.charAt(i);
		}
		if(s2.equals(revResult)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}

	}

}
