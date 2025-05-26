package string_methods;

import java.util.Arrays;

public class CountEachCharacterOfGivenString {

	public static void main(String[] args) {
		String s1="banana";
		String[] s2=s1.split("");
		System.out.println(Arrays.toString(s2));
		for (int i=0; i<s2.length; i++) {
			int count = 0;
			boolean isCounted=false;
			for(int k=0; k<i; k++) {
				if(s2[i].equals(s2[k])) {
					isCounted=true;
					break;
				}
			}
			if(!isCounted) {
				for (int j=0; j<s2.length; j++) {
					if(s2[i].equals(s2[j])) {
						count++;
					}
					//System.out.println(s2[i] + " appears " + count + " times " + (count>1 ? "s" : ""));
				}
				System.out.println(s2[i] + " = " + count);
			}
		}

	}

}
