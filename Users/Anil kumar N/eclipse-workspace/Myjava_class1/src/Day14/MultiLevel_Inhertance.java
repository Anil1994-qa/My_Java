package Day14;

class E
{
	String e="Anil";
	void Display()   //// Parent Class
	{
		System.out.println(e);
	}
}

class F extends E   // Child class
{
	String f="Gowda";
	void show()
	{
		System.out.println(f);
	}
}

class C extends F  // By adding c class it becomes multi level inheritance
{
    String c="sowmya";
	void print()
	{
		System.out.println(c);
	}
}







public class MultiLevel_Inhertance {
public static void main(String[] args) {
	
       C ca= new C();
   	System.out.println(ca.e);
	System.out.println(ca.f);
   	System.out.println(ca.c);
   	
   	ca.Display();
   	ca.show();
    ca.print();
    
      
    
       
       
       
       
       
       
       
	}

}
