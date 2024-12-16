package Day_9;

import java.util.Arrays;

public class mutable_vs_immutabile {

	public static void main(String[] args) {
		//Mutable --We can Change the values
		int a[]= {50,60,40,10,15,5,90};
        System.out.println(Arrays.toString(a));
        
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));// If any method or operation is changing the original element/value of the variable is called mutable feature
		
		
		
		
		//Immutable --we can not change the values
		String s=new String("welcome");
		System.out.println(s);
		String concatestring=s.concat("to java");
		System.out.println(concatestring); // If any method or operation is not able to change the execisting l element/value of the variable is called immutable feature
		// Strings are immutable we can not change the values
		
		
		

	}

}
