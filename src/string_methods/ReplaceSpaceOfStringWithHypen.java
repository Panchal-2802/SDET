package string_methods;

public class ReplaceSpaceOfStringWithHypen {
	/*Replace All Spaces in a String with Hyphen (-)
	Problem:
	Input: "Java is awesome"
	Output: "Java-is-awesome"*/
	public static void main(String[] args) {
		String s1="Java is awesome";
		String s2=s1.replace(" ", "-");
		System.out.println(s2);
		
		// Aprroach - 2
		System.out.println("-- Appraoch - 2 -- ");
		String s3="";
		for (int i=0; i<s1.length(); i++) {
			char character =s1.charAt(i);
			if(character == ' ' ) {
				s3+='-';
			}
			else {
				s3+=character;
			}
		}
		System.out.println(s3);
	}

}
