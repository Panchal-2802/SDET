package string_methods;

import java.util.Arrays;

public class ReverseStringWithoutInBuiltMethod_interview {
/*Input: "Interview"
Output: "weivretnI"
🧠 Hint: Use a loop to build the reverse manually (char by char).*/
	public static void main(String[] args) {
		String s1="Interview";
		String s2[] = s1.split("");
		System.out.println(Arrays.toString(s2));
		for(int i=s2.length-1; i>=0;i--) {
			System.out.print(s2[i]);
		}

	}

}
