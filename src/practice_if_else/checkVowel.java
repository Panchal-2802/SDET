package practice_if_else;

public class checkVowel {

	public static void main(String[] args) {
		char ch = '!';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("The entered character is vowel : " + ch);
		}
		else if ((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')){
			System.out.println("The entered character is consonant : " + ch);
		}
		else {
			System.out.println("The character is invalid : " + ch);
		}

	}

}
