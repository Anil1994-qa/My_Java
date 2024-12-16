package Day_19;

/*Up casting - converting value from smaller to larger/higher
Ex 01 - int(smaller) to long (larger)
      - float- double
Down casting - converting value from larger to smaller (Manual process)
 Ex 02- double- float
      - long (larger) to int(smaller)
*/
public class TypeCastingDemo {
public static void main(String[] args) {
//Up casting (Automatic)- converting value from smaller to larger/higher
	int intvalue=1000;  // Ex 01
	long longvalue=intvalue;
	System.out.println(longvalue);	
	
	
	float floatvalue=10.5F;  // Ex 02
	double doublevalue=floatvalue;
	System.out.println(floatvalue);	
	
//Down casting(Manual)- converting value from larger to smaller (Manual process)	
	long lvalue=100000; // Ex 01
	int ivalue=(int)lvalue;
	System.out.println(lvalue);
	
	double dvalue=125.55; // Ex 02
	float fvalue=(float) dvalue;
	System.out.println(dvalue);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	int i=100;
	double d=i;  //up casting
	System.out.println(d); // 100.0
	
        //Ex 04
	double d1=10.5;
	int i1=(int) d1;
	System.out.println(d1); //10
	
	
	
	
	
	}

}
