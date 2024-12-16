package Day_9;

public class String_assignments {

	public static void main(String[] args) {
		// Check the string is palindrome or not
		
		String s="MADAM";
		String rev="";
		for(int i=s.length()-1; i>=0;i--)
		rev=rev+(s.charAt(i));
		{
		if(s.equals(rev))
			System.out.println("string is palindrome:"+rev);	
		else
			System.out.println("string is not palindrome");
		}
		// Ex 02	
		
		String s1="welcome";
		String reverse="";
		for(int j=s1.length()-1;j>=0;j--)
		reverse=reverse+(s1.charAt(j));
		{
			if (s1.equals(reverse))
				System.out.println("String is palindrome");
			else
				System.out.println("string is not palindrome:"+reverse);
		}
		
		// Reveres a string 
		
		
			
				
	}

		}


