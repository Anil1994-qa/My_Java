package Day_5;

public class for_loop {

	public static void main(String[] args) {
		
		// ex  1 ......10 num 
		
	/*	for(int a=1; a<=10;a++)
		{
	       System.out.println(a);
	    }*/

		// Ex 02 1.....10 even num
		
	/*	for(int b=2;b<=10;b+=2)
		{
			System.out.println(b);
		} 
		
		// EX 03......10 
		/* 1 Odd
		  2 even
		  3 odd
		  4 even
		 */
		
		for (int c=1;c<=10;c++)
		{
			if(c%2==0)
			{
				System.out.println(c + "Even Number");
			}
			else
			{
				System.out.println(c + "Odd Number");
			}
		} 
		
		// Example 4 - 10......1 Desending order
		
		for(int d=10; d>0;d--)
		{
			System.out.println(d);
		}
			
	
		
	}
}
