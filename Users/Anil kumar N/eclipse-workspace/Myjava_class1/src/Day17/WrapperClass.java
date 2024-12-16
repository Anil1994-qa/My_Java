package Day17;

public class WrapperClass {
public static void main(String[] args) {
	
	//String to int
	
	// String s="AnilGowda"; // This we can't convert into int it is not in number format
	String s1="10";
	String s2="200";
	System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	
	//String to double
	
	String s3="10.5";
	String s4="12.5";
	System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
	
	// boolean to String 
    String s5="false";
    System.out.println(Boolean.parseBoolean(s5));
    String s6="True"; // Other than true if you pass any value that will considered as false
    System.out.println(Boolean.parseBoolean(s6));
	
  // String to char --- is not possible(Since string contains multiple characters where as char contains only one character
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
  // From primitive type to string type 
  // int, double, boolean, char -----String (Convert all primitive data types into string format
    
    int a=500;
    double d=240;
    char c ='A'; // char to string is possible
    boolean b=true;
    //String.valueOf()---
    String s7=String.valueOf(a);
    System.out.println(String.valueOf(a));
    
    String s8=  String.valueOf(d);    
    System.out.println(String.valueOf(d));
    
    String s9=  String.valueOf(c);
    System.out.println(String.valueOf(c));
    
    String s10=  String.valueOf(b);
    System.out.println(String.valueOf(b));
    
    
    
    
    
    
	}

}
