package Day18;
public class finally_Block {
public static void main(String[] args) {	
	
	 String s=null;
	    try {
	    	
	    System.out.println(s.length());
	    
	    }catch(Exception a) {
	    
	    	 System.out.println("Catch block Handle exception");
	    	 System.out.println(a.getMessage());
	    
	    }finally{
	    	 System.out.println("You have entered into finally block");
	    	 System.out.println("Program finished");
	    }
	    

	}

}
