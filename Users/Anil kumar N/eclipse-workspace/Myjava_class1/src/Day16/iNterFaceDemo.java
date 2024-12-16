package Day16;
interface Shape
{
	int length=10; // final & static variable
	int width=20;  // final & static variable
	
	public abstract void  circle();  // Abstract method
	
	default void square()
	{
		System.out.println("This is square");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle-Static method");
	}
	public abstract void Round();
	
}
public class iNterFaceDemo implements Shape 
{
	
	public void circle()
	{
		System.out.println("This is abstract method");
	}
	  public void Round() {
			
		  System.out.println("This is also abstract method");
	  }
public static void main(String[] args) {
	//Scenario 1
	/*iNterFaceDemo idobj= new iNterFaceDemo();
	idobj.circle();  // abstract
    idobj.square(); // Default
    Shape.rectangle(); // static method can be accessed from interface
*/
    
  //Scenario 2
    Shape sh=new iNterFaceDemo();
    sh.circle(); // abstract
    sh.square();  // Default
    Shape.rectangle(); // static method can be accessed from interface
    sh.Round();
	}

    
   


	
}


