package string_methods;

public class CheckGivenStringIsPalindromeOrNot {

	public static void main(String[] args) {
		String s1="racecar";
		String reverse="";
		int lengthOfString = s1.length();
		System.out.println("The length of string : " + lengthOfString);
		for(int i=lengthOfString-1; i>=0; i--) {
			reverse+=s1.charAt(i);
		}
		System.out.println("Reverse string : " + reverse);
		if(s1.equals(reverse)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palidrome");
		}

	}

}
