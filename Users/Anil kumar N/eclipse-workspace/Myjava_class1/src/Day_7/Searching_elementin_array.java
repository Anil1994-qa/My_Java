package Day_7;

public class Searching_elementin_array {

	public static void main(String[] args) {
		
	
		int []a= {10,20,30,40,50}; 
		int search_element=300;
		boolean status=false;  // taken boolean help to get print if element not found check class 7 at 20:min
		/*for(int i=0; i<a.length;i++)       // Normal for loop
		{
			if(a[i]==search_element)
			{
		    System.out.println("Element found");
		    break;                              // if element found we can break the execution
		    }
			
		}*/
		
		// Enhanced for loop
		for(int z:a)
		if(z==search_element)
		System.out.println("element found");
		status=true;
		if(status=false)
		System.out.println("Element not found");
	    
	
	
	
	
}


	}
	
	
		

		
		

	


	
