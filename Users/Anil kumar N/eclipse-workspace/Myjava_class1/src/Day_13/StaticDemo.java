package Day_13;

public class StaticDemo {
	
	static int a=10;  // static variable
	       int b= 20; // non static variable
	       
	       static void m1() // static variable
	       {
	    	   System.out.println("This is m1 static method...");
	       }
	     void m2()  // Non static variable
	     {
	    	 System.out.println("this is m2 non static method...");
	     }
	     void m3() // Non static variable
	     {
	    	 System.out.println(a);
	    	 System.out.println(b);
	    	 System.out.println(a+b);
	    	 m1();
	    	 m2();
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(a); // static methods can be access static stuff directly(without any object) 
		m1();
		
		// non static variable 
		//System.out.println(b);  Cannot access, since b is non static is non static variable
		//m2(); cannot access, m2()
		
		StaticDemo cd= new StaticDemo(); 
		System.out.println(cd.b);
		cd.m2();
		
		
		cd.m3(); 
	     

	}

}
