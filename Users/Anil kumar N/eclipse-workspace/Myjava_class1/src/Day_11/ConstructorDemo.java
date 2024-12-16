 package Day_11;

public class ConstructorDemo {
	int x,y;
	ConstructorDemo() //default constructor (no parameters)
	{
		x=100;
		y=200;
	}
	
	 ConstructorDemo(int a, int b) //parameterized constructor
	 {
		 x=a;
		 y=b;
	 }
	void sum()
	{
		System.out.println(x+y);
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	public static void main(String[] args) {
		  ConstructorDemo ab=new ConstructorDemo (); // This will invoke default constructor
          ab.sum();
          ConstructorDemo ab1=new ConstructorDemo (10,200);// this will invoke parameterized constructor
          ab1.sum();
	}

}
