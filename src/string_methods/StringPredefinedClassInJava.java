package string_methods;

import java.util.Arrays;

public class StringPredefinedClassInJava {
	
public static void main(String[] args) {
	String s="Hardik";
	System.out.println("To calculate the character of string");
	System.out.println("----" + "Approach - 1" + "-------");
	System.out.println("s.length() method is used : " + s.length());
	System.out.println("----" + "Approach - 2" + "-------");
	int s2=s.length();
	System.out.println("Create a variabel and store into it : " + s2);
	System.out.println();
	
	// concate by default java method
	String s3="panchal";
	System.out.println("----" + "Approach - 1 for concate" + "-------");
	System.out.println("By defined method string variable name.concate(second string variable name)");
	System.out.println(s.concat(s3));
	System.out.println("----" + "Approach - 2 for concate" + "-------");
	System.out.println("By using + icon ");
	System.out.println(s+s3);
	System.out.println();
	
	// trim() -- which is used to remove the space from left and right side of string value
	
	String s4="   panchal   ";
	System.out.println(s4);
	System.out.print("Before trimming lenght of character : ");
	System.out.println(s4.length());
	System.out.println(s4.trim());
	System.out.println("after trimming length of character : " +s4.trim().length());
	
	// charAt() -- return character based on index
	String s5="welcome hardik";
	System.out.println(s5.charAt(3));
	
	// contains() -- return true or false
	System.out.println(s5.contains("me hard"));
	System.out.println(s5.contains("WELCOME"));
	
	//equals() & equalIgnoreCase() -- this method is used to compare two strings
	String s6="Welcome";
	String s7="Welcome";
	System.out.println(s6.equals(s7));
	System.out.println(s6.equals("Welcome"));
	System.out.println(s6.equals("welcome"));
	System.out.println(s6.equalsIgnoreCase("welcome"));
	
	// replace() -- to replace character in string 
	String s8="Hi my name is hardik" ;
	System.out.println("To replace a whole word : " + s8.replace("hardik", "sanjay"));
	System.out.println("To replace single char : " + s8.replace('a', 'h'));
	String s12="$15,12,13"; //output:-151213
	System.out.println(s12.replace("$", "").replace(",", ""));
	
	
	// substring() -- thumb rule start index start from 0 but end index ends with start index+1
	String s9="Selenium";
	System.out.println(s9.substring(0, 6));
	
	// toUpperCase & toLowerCase
	
	String s10="hardik";
	System.out.println(s10.toUpperCase());
	System.out.println(s10.toLowerCase());
	
	// split() - to split the string into multiple parts based on delimeter
	// Note:- delimeter means special character from which the string needs to separate ex: @,!,',' space is also a delimieter...
	// Not consider as delimeter :*, %, ^, &, - 
	String s11="abc@gmail.com";
	String a[]=s11.split("@"); // we store two different string
	System.out.println(a[0]); // abc
	System.out.println(a[1]); // gmail.com
	System.out.println(Arrays.toString(a));
	String b[]=s11.split("b");
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(Arrays.toString(b));
	
	String s13="abc,123@xyz";
	String c[]=s13.split(",");
	System.out.println(Arrays.toString(c));//[abc,  123@xyz]
	String d[]=c[1].split("@");
	System.out.println(Arrays.toString(d));//[123, xyz]
	System.out.println(d[0]);//123
	System.out.println(d[1]);//xyz
	
	String s14 ="abc gmail";
	String e[]=s14.split(" ");
	System.out.println(Arrays.toString(e));
	
	String s15="John Kennedy";
	System.out.println(s15.equalsIgnoreCase("john"));
	System.out.println(s15.toLowerCase().contains("john"));
	System.out.println(s15.toUpperCase().contains("JOHN"));
	System.out.println(s15.replace("J", "j").contains("john"));
	
}
}
