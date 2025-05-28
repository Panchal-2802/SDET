package string_methods;

import java.util.Arrays;

public class ReverseTheWordInGivenString_interview {
	/*Input: "I love Java"
		Output: "I evol avaJ"*/
	public static void main(String[] args) {
		String s1="I love java";
		String s2[]=s1.split(" ");
		String s3="";
		String result ="";
		//System.out.println(Arrays.toString(s2));
		for(int i=0; i<s2.length;i++) {
			s3=s2[i];
			String revWord="";
			for(int j=s3.length()-1; j>=0; j--) {
				revWord+=s3.charAt(j);
				
			}
			result+=revWord+" ";
		}
		System.out.println(result);
	}

}
