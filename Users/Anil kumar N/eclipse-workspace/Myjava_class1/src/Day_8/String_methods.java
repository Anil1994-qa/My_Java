 package Day_8;

public class String_methods {

	public static void main(String[] args) {
		
	//	String objectu=new ("welcome"); Another way of creating string
		/*String object="welcome";
		{
			System.out.println(object);
		}*/
		
		// length () - length of a string(number of a characters)

		String a="Neemashree";
		int b=a.length(); // we can write directly a.length(); like this
		{
			System.out.println(b);
		}
		// System.out.println("Neemashree".length); -------We can print the number of string directly
		
		
		// Concat( joining strings)
		String s1="Nagaraj:";
		String s2="Yashodhamma";
		{
			System.out.println(s1.concat(s2));
			//System.out.println(s1+s2);
		}
		
		// Ex 03 concat 3 strings or more
		
		String a1="Anil ";
		String a2="Started ";
		String a3="automation ";
		
		System.out.println(a1.concat(a2).concat(a3));
		
		// Trim - it will remove spaces from right and left side
		
		String b1="   Anil Gowda   ";
		System.out.println(b1); // Printed strings along with the spaces
		System.out.println(b1.trim()); // printed without spaces
		
		// Find out the string length before trim & after string
		 System.out.println("Before trim:"+b1.length());
		 
		 // After trim the string length
		 System.out.println("after trim:"+b1.trim().length());
		
	}

}
