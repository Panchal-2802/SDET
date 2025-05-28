package string_methods;

public class CalculateLengthOfStringWithoutInbuiltMethod_interview {
// calculate length of string without inbuilt method
	public static void main(String[] args) {
		String s1="Learn java";
		String s2="Learn java";
		int count1=0;
		int count=0;
		System.out.println("--With inbuilt method--");
		System.out.println("The length of string by inbuilt : " + s1.length());
		System.out.println();
		System.out.println("--without inbuilt method--");
		for(int i=0;i<s1.length();i++) {
			s1.charAt(i);
			count++;
		}
		System.out.println("The length of string : " + count);
		System.out.println();
		System.out.println("--after removing space--");
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ') {
				count1++;
			}
		}
		System.out.println("length of string : " + count1);

	}

}
