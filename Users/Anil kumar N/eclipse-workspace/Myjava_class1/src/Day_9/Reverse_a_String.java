package Day_9;

public class Reverse_a_String {

	public static void main(String[] args) {
		// Approach 1---using length() & charAT() (reverse method is not available in string class it's only available in stringbuffer & stringbuilder)
		String s="AnilGowda";
		String reverse="";
		for(int i=s.length()-1; i>=0;i--)
		{
			reverse=reverse+(s.charAt(i));
		}
		System.out.println("Reverese of string:"+reverse);
		
		// Approach 2 ---by converting string to char array type
		
		String s1="Neemashree";
		String rev="";
		char a[]=s1.toCharArray();
		for(int b=s1.length()-1;b>=0;b--)
		{
			rev=rev+a[b];
		}
		{
			System.out.println("reverse of an string:"+rev);
		}
		
		// Approach 03-----Using StringBuffer class
		
		StringBuffer s2=new StringBuffer("Automation");
		{
			System.out.println("Reverse an string using stringbuffer:"+s2.reverse());
		}
		
		// Approach 03--------Using string builder class
		
		StringBuilder s3=new StringBuilder("Software");
		{
			System.out.println("Reverse an string using stringbuilder:"+s3.reverse());
		}
		
		
		
		
		

	}

	private static String toCharArray(int c) {
		// TODO Auto-generated method stub
		return null;
	}

}
