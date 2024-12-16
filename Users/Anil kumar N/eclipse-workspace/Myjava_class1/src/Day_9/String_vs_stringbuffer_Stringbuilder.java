package Day_9;

public class String_vs_stringbuffer_Stringbuilder {

	public static void main(String[] args) {
		// String -Immutable
		String s1="welcome";
		s1.concat("to java");
        System.out.println(s1); // immutable, can't change the original value of an variable
		

       // StringBuffer - Mutable 
        StringBuffer s2=new StringBuffer("Automation");
        s2.append("Testing");
        System.out.println(s2); // Mutable, can change the original value of s2
        
        
        // StringBuilder - Mutable
        StringBuilder s3=new StringBuilder("Anil");
        s3.append("Neema");
        System.out.println(s3); // Mutable, can change the original value of s3
        
	}

}
