package Day12;

public class Adder {
	
	int a=10, b=20;
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y) // Number of parameters is different
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y) // data of parameters is different
	{
		System.out.println(x+y);
		
	}
	void sum(double x, int y) // order of parameters is different
	{
		System.out.println(x+y);
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

}
