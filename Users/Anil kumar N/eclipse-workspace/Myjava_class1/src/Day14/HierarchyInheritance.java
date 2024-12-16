package Day14;

 class Parent
 {
	 
  void display(int a)
  {
  System.out.println(a);
  }
  
 }
 class Child extends Parent 
 {
	 void shown(int b)
	 {
		 System.out.println(b);
	 }
 }
class Child1 extends Parent
{
	void print(int c)
	{
		 System.out.println(c);
	}
}

public class HierarchyInheritance {
public static void main(String[] args) {
	
	Child ch=new Child();	
	ch.display(100);
	ch.shown(200);
  
	
	Child1 ch1=new Child1();
	ch1.display(600);
	ch1.print(500);
	
	

	}

}
