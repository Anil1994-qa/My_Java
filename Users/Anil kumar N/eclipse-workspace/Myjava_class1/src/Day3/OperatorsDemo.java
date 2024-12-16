package Day3;

public class OperatorsDemo {

	private static int value;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1) Arithmetic operators + - * / %  only applicable to numerics
		
		int a=20, b=10;
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multi of a and b is:"+(a*b));
		System.out.println("Division of of a and b is:"+(a/b));
		System.out.println(" Modulo Division of of a and b is:"+(a/b));
		
		//2) Relational/Comparison Operators > >=  <   <=   !=   ==)
		// retunrs boolean true/false
		
		System.out.println(a>b);  // true
		System.out.println(a<b);  //false
		System.out.println(a<+b);  // true
		System.out.println(a>=b);		
		b=20;
		a=30;
		System.out.println(a<=b);  // false
		System.out.println(a!=b);    //true
		System.out.println(a==b);      // false
		
		
		boolean res=a<b;
		System.out.println(res);
		
		// 3) Logical operators  &&  || !
		// returns boolean value  - true/false
		// Works between 2 logical operators
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); // false
		System.out.println(x || y);  // true
		System.out.println(!x);     // false
		System.out.println(!y);     // true
		
		
		boolean b1=100>200;
		System.out.println(b1);   //false
		
		boolean b2=200>100;
		System.out.println(b2);   // true
		
		System.out.println(b1 && b2);  //false
		System.out.println(b1 || b2);   // true
		
		System.out.println((100<200) && (200>100));  // true
		System.out.println((200>100) || (100>200)); // true */
		
		
		// 4) Incremental operators //  ++
		
		// Case No 1
		
		int c=10;
		System.out.println(c);
		
		// c=c+1;     // instead of this we can write c++;
	//	System.out.println(c);
		
		c++;
		System.out.println(c++);
		
		// Case no 2  - post increment
		
		int d=10;
		int result=d++;
		// System.out.println(result);  //10
		System.out.println(c);
		
		// case 03  -------pre increment
		
		int e=10;
		int result1=++e;
		System.out.println(result1);
		
		int f=200;
		
		int af=++f;
		System.out.println(af);
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
	}

}
