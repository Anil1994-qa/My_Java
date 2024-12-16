package Day_8;

import java.util.Arrays;

public class String_methods_2 {

	public static void main(String[] args) {
	String	s="welcome";
// charAt() - returns a character from a string based on the index
	
	System.out.println(s.charAt(5)); // 
	
	
// contains() method ----returns boolean value -- the value we are passing the string is a part of main string it will return as true if not part of it then false
	
	System.out.println(s.contains("wel"));
	System.out.println(s.contains("come"));
	System.out.println(s.contains("Wel")); // it treats small & upper case also
	
	
// equals(), equalsIngoreCase()----To compare strings	
	
	String s1="welcome";
	String s2="welcome";
	
	System.out.println(s1.equals(s2));  // returns boolean value
	//equalsIngoreCase()--- it will ignore case sensitive (smaller and upper case) 
	System.out.println(s1.equalsIgnoreCase("Welcome")); //true

	// Replace method-- this method will replace single or multiple/sequence of characters in a string
	String s3="welcome to selenium java selenium python selenium c#";
	System.out.println(s3.replace('e','x'));
	System.out.println(s3.replace("selenium","playwright"));
	
	
	// substring -----extract substring from the main string
	
	String s4="Neemashree";
	System.out.println(s4.substring(5, 10));  // Shree
	
	System.out.println(s4.substring(0, 5));  // Neema
	
	
	
	// Converting case----we can covert lower case to upper and upper case to lower
	//toUppercase() , toLowercase()
	
	
	System.out.println(s4.toUpperCase());// NEEMASHREE
	System.out.println(s4.toLowerCase()); // neemashree
	
	// split() method----split the string into multiple parts based on the delimeter
	String s5="abc@gmail.com";
	
	String a[]=(s.split("@"));
	{
	System.out.println(a[0]);
	System.out.println(a[1]);
	}
	
/*	String s5="$15,30,55"; // print without cama & $
	//)
     System.out.println(s5.replace("$", ""));
     System.out.println(s5.replace(",", ""));
	
	
	// ex 02
     
     String s6= "abc,123@xyz";
    // String arr1[]=s.split(",");
   //  System.out.println(Arrays.toString(arr1));
*/
 
	
	
	
	
	}

}
