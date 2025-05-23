package string_methods;

public class StringComparision {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("welcome");
		s1.append(" to home"); // for string buffer class append act a concate
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("welcome");
		s2.append(" to my home");
		System.out.println(s2);
		
		// understand difference between string declaretion
		// case 1 : To declare string and initilization
		String s3="juicy";
		String s4="juicy";
		System.out.println(s3==s4);//true
		System.out.println(s3.equals(s4));// true
		
		// case 2: To declare string and initialization
		String s5=new String("Horror");
		String s6=new String("Horror");
		System.out.println(s5==s6);//true
		System.out.println(s5.equals(s6));//true
		
		// case 3: To declare string and initialization
		String s7="buddy";
		String s8 = new String("buddy");
		System.out.println(s7==s8);// false because at line 29 we create string object 
		                           // so to compare with other string that needs to be an object
		System.out.println(s7.equals(s8));//true
		
		// case 4: To declare string and initialization
		String s9="buddy";
		String s10 = new String("buddy");
		String s11=s10;
		System.out.println(s9==s10);//false
		System.out.println(s9.equals(s10));//true
		System.out.println(s10==s11);//true

	}

}
