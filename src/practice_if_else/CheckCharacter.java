package practice_if_else;

public class CheckCharacter {

	public static void main(String[] args) {
		char character = 'z';
		if (character >= 'a' && character <='z') {
			System.out.println("The Entered character is lower case : " + character);
		}
		else if(character>='A' && character<='Z') {
			System.out.println("The Entered character is upper case : " + character);
		}
		else {
			System.out.println("The Entered character is not an alphabet");
		}

	}

}
