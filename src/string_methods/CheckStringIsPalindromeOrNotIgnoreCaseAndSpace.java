package string_methods;

public class CheckStringIsPalindromeOrNotIgnoreCaseAndSpace {
	/*Check if a String is a Palindrome (Ignore Case & Spaces)
	Problem:
	Check if the given string is a palindrome (same forwards and backwards), 
	ignoring spaces and case.

	📥 Example:
	Input: "Race car"
	Output: true
   🧠 Hint: First remove spaces, convert to lowercase, then compare with reversed version.*/
	public static void main(String[] args) {
		String s1 = "Race cae";
		String s2 = s1.replace(" ", "");
		String rev = "";
		System.out.println("New string without space : " + s2);
		String s3 = s2.toLowerCase();
		for (int i=s3.length()-1; i>=0; i--) {
			rev+=s3.charAt(i);
			
		}
		if(s3.equals(rev)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("Is not palindrome");
		}

	}

}
