package string_methods;

public class RemoveJunkCharacterFromString {

	public static void main(String[] args) {
		 String input = "Wel@#$c(*ome";
	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a letter
	            if (Character.isLetter(ch)) {
	                result += ch; // Append to result if it's a letter
	            }
	        }

	        // Output the cleaned string
	        System.out.println("Cleaned string: " + result);
	    }

	}

