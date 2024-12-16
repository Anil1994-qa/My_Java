package Day_11;

public class GreetingsMainclass {

	public static void main(String[] args) {
		// 01 No params----no return value
		Greetings gr=new Greetings();// if method is returning some value then no need to store that in any variable
		gr.m1();
		
		// 02 No params----return value
		String s=gr.m2(); // When ever method is returning some result/output we need to hold that output in one variable
		{
			System.out.println(s);// Suppose if we don't creat a variable we can directly print the value (gr.m2())by print like this	
		}
		// 03 Takes params -----No return value
		
		   gr.m3(" Anil");

		// 04 Takes params------Returns value   
		   String var=gr.m4("Neema");
		   {
			   System.out.println(var);  
		   }
		   
	}

}
