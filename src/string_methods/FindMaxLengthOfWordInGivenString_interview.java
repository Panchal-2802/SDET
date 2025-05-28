package string_methods;

import java.util.Arrays;

public class FindMaxLengthOfWordInGivenString_interview {
	 /*Find the Word with the Maximum Length in a Sentence
	 Problem:
	 Input: "Coding is powerful and creative"
	 Output: "powerful"*/
	public static void main(String[] args) {
		String s1="Coding is powerful and creative";
		String s2[]=s1.split(" ");
		String s3=s2[0];
		//System.out.println(Arrays.toString(s2));
		for (int i=0; i<s2.length; i++) {
			if(s2[i].length()>s3.length()) {
				s3=s2[i];
			}
			
		}
		System.out.println("The max length of word : " + s3);

	}

}
