package Day_19;

class Parent{
	String name="johnny";
	
	void m1() {
		System.out.println("This is m1 from parent");	
	}
}
class Child extends Parent{
	int id=101;
	void m2() {
		System.out.println("This is m2 from child");
	}
}
public class TypeCastingObjectes1 {
public static void main(String[] args) {
		
	Child c=new Child();  
	System.out.println(c.name); //parent
	c.m1();                     //parent
    System.out.println(c.id);   //child
    c.m2();                     //child
     
     
    Parent p=new Child();  // Up casting
    System.out.println(p.name); //parent
	p.m1();                     //parent
	
   // System.out.println(p.id);   //child  //We can not access
   // p.m2();                     These are belongs to child class we can only access parent class
          
	}

}
