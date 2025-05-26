package string_methods;

import java.util.Arrays;

public class ReverseTheWordInSentence {
//output:-"avaJ si nuf"
	// intput = "java is fun"
	public static void main(String[] args) {
		/*String s1="Java is fun";
		String rev="";
		String finalString="";
		for(int i=s1.length()-1; i>=0; i--) {
			rev+=s1.charAt(i);
		}
		System.out.println(rev);
		String s2[]=rev.split(" ");
		
		System.out.println(Arrays.toString(s2));
		for (int i=3; i<=s2.length; i--) {
			finalString = s2[i];
		}
		String temp1=s2[2];
		String temp2=s2[1];
		String temp3=s2[0];
		String temp4=temp1 + " " + temp2 + " " + temp3 ;//temp1+temp2+temp3;
		System.out.println(finalString+" ");*/
		
		String s1 = "Java is fun";
        String[] words = s1.split(" ");
        String result = "";
        System.out.println(Arrays.toString(words));
        System.out.println("length of string array : " + s1.length());

        for (int i = 0; i < words.length; i++) {
            String word = words[i];// word = words[0]=>java
                                   // word = words[1]=>is
                                   // word = words[2]=>fun
            String revWord = "";//avaJ si 
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord += word.charAt(j);//=revWord=revWord+word.charAt(3)=>a
                                          //=revWord=a+word.charAt(2)=>v
                                         //=revWord=av+word.chart(1)=>a
                                         //=revWord=ava+word.charAt(0)=>j
                                         //revWord=avaJ;
                                         //revWord = revWord+charAt(1)=>avaJs
                                        // revWord = revWord+charAt(0)=>avaJsi
            }
            result += revWord + " "; // avaJ si 
        }//i++ 1 2

        System.out.println(result);
		

	}

}
