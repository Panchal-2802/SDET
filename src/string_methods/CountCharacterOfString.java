package string_methods;

public class CountCharacterOfString {
/*Input: "apple"
Output:
a = 1p = 2,l = 1,e = 1
🧠 Hint: Use nested loops. Later you can improve it using maps when you're ready.*/
	public static void main(String[] args) {
		String s1 = "apple";
		String s2="";
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			s2+=s1.charAt(i);
			count++;
		}
		System.out.println(count);

	}

}
