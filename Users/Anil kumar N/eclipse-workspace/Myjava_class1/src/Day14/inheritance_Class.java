package Day14;

class A
{
	int a=100;
	void Display()   //// Parent Class
	{
		System.out.println(a);
	}
}

class B extends A   // Child class
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}


public class inheritance_Class {
public static void main(String[] args) {
		
	B BA= new B();
	System.out.println(BA.a);
	System.out.println(BA.b);

	
	BA.Display();
    BA.show();

// This is called single parent & single Class
	}

}
