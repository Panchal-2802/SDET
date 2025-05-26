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

	}

}
