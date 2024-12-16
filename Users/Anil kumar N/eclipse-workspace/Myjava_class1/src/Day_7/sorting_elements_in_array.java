package Day_7;

import java.util.Arrays;

public class sorting_elements_in_array {

	public static void main(String[] args) {
		
		
		int a[]= {100,600,200,400,500};
		
		System.out.println("Before sorting:"+Arrays.toString(a));
		
		Arrays.sort(a); // sort elements in an array
		
		System.out.println("After sorting:"+Arrays.toString(a));
		
		
		
		// EX 2
		
		int b[]= {10,8,6,4,3,2,0,1};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		// Ex 03
		
		int c[]= {260,383,8736,53,13,142,524,53,142,253};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		
		
		
	}
	

}
