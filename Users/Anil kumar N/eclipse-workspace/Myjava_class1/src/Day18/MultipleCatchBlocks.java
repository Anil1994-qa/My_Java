package Day18;

public class MultipleCatchBlocks {
public static void main(String[] args) {
		
    System.out.println("Program is started...");
    String s=null;
    try {
    	 System.out.println(s.length());
    /*catch(ArithmeticException a) {
    
    	 System.out.println("Handle exception");
    	 System.out.println(a.getMessage());
    }catch(NullPointerException a){
    	System.out.println("Handle exception");
   	 System.out.println(a.getMessage());
    }catch(NumberFormatException a) {
    	System.out.println("Handle exception");
   	 System.out.println(a.getMessage());
    }*/
    }catch(Exception a) {    // we can handle all type of exceptions because Exception is Parent/super class all kind of exceptions
    	System.out.println("Handle exception");
      	 System.out.println(a.getMessage());	
    }
    
    System.out.println("Program is Completed");
	System.out.println("Program is exited..");
    
	

}

}