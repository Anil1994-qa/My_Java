package Day_13;

public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.a); // If u separately created another class we have to specify the class name to access the methods 
		StaticDemo.m1();
		
		// non static variable 
		//System.out.println(b); 
		// m2(); 
		
		StaticDemo cd= new StaticDemo(); 
		System.out.println(cd.b);
		cd.m2();
		
		// Method m3
		cd.m3();

	}

}
