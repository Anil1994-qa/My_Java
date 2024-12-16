package Day_6;

import java.lang.reflect.Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int a[]=new int[5]; //--- 01 ------ Declaring array
		a[0]=100;
		a[1]=200;
		a[2]=300; //-------Approach 01
		a[4]=400;
		System.out.println(a[4]); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		int b[]= {100,200,300,400,500};
		                                   // ------Approach 02
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// Find length of an array
		System.out.println("Length of an array:"+ b.length); //---------to find how many variables in the array check b in b array i stored 5 values
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// Read single value from an array
		// System.out.println(b[4]);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
	// Reading all the values from array(by using normal for loop)	
		
		for(int c=0; c<4; c++) //( c<=4, c<5,  c<=b.length we can write any condition)
		{
		System.out.println(b[c]); // need to print 100, 200, 300, 400	
		} 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	// Enhanced for loop/ for each loop	
		 for(int x:b)
		{
			System.out.println(x);
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
	/*	int i[]=new int[5];
		i[0]=150;
		i[1]=280;
		i[2]=320;
		i[4]=440;
		
		for (int a=0; a<i.length; a++)
		{
		System.out.println(i[a]);
		}
		
		int sum=i[0]+i[1]+i[2]+i[3]+i[4];
		{
			System.out.println(sum);
		}
		
		
		int[]k= {100,348,459,494};
		{
	//		System.out.println(k.length);
		}
		
		for(int l=0; l<k.length;l++)
		{
			System.out.println(k[l]);
		}
		
		int total=k[0]+k[1]+k[2]+k[3];
		{
			System.out.println(total);
		}*/
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// Assignments (Print the sum of the integers in an integer array.
		
	/*	int[]z= {2,5,1,9,6,25};
		
		int length= z.length;
		
		int add=0;
		for (int s=0;s<z.length;s++)
		     add=add+z[s];
		System.out.println("sum of :"+add);
	 // System.out.println(z[s]);  read all the numbers in array
      // Find length of an array
		
		System.out.println("length of an array:"+z.length);
	// Enhanced for loop for reading all the arrays	
		for(int x:z)
			System.out.println(x+" ");*/
		
				
		
		
		
		
		}
		
		
		
	}


