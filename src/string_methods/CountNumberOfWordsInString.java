package string_methods;

import java.util.Arrays;

public class CountNumberOfWordsInString {
	//Count the Number of Words in a Sentence
	//Input: "Java is a widely-used language"
    //Output: Number of words = 5
	public static void main(String[] args) {
	    String s1="Java is a widely-used language";
		int count=0;
		String s2[]=s1.split(" ");
		//System.out.println(Arrays.toString(s2));
		for (int i=0; i<s2.length; i++) {
			count++;
		}
		System.out.println("Number of words : " + count);
		
		}
	}


