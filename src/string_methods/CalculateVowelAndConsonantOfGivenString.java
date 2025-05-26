package string_methods;

import java.util.Arrays;

public class CalculateVowelAndConsonantOfGivenString {
	/*Given a string, count how many vowels and consonants it contains.
	Input: "Java Programming"
	Output:Vowels: 5 & Consonants: 9*/
	public static void main(String[] args) {
		String s1="Java Programming";
		s1=s1.toLowerCase();
		char character[]=s1.toCharArray();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0; i<character.length;i++) {
			char ch=character[i];
			if(Character.isLetter(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
				
			}
		
		}
		System.out.println("The number of vowels in string : " + vowelCount);
		System.out.println("The number of consonant in string : " + consonantCount);
	}

}
