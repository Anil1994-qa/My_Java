package Day_6;

public class doble_Dimensional_Array {

	public static void main(String[] args) {
		// Declaring array
		// Approch 01 
		
		/*int a[][]=new int [3][2];  // i can put like this also  int [][]a // []a[](both are correct)
        a[0][0]=100;
        a[0][1]=200;
        
        a[1][0]=300;  // ----------Approach 01
        a[1][1]=400;
        
        a[2][0]=500;
        a[2][1]=600;
        System.out.println(a[1][0]);*/
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
		
		// Approach 02
		
		int [][]b = { {100,200}, // Else i can write in single flower bracket also {{100,200},{300,400},{500,600}};
	              	  {300,400},
	               	  {500,600},
		             };
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// Find size of an array
		System.out.println("length of rows:"+b.length);
		System.out.println("lenght of colums:"+b[0].length);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// Read single value from an array
		// System.out.println(b[2][1]);  // 600
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Reading all the values from array(by using normal for loop)	
		
		
		/*for(int r=0; r<=2; r++)
		{
			for(int c=0;c<=1;c++)
			{
		    System.out.println(b[r][c]);	
			}
			System.out.println();
		    }*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
	// Enhanced for loop	
		
		/*for(int arr[]:b)
		{
			for(int x:arr)
			{
			System.out.print(x+"  ");
			}
			{
			System.out.println();
			}
		}*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		int c[][]= {{1000,2000},
				    {4000,6000},
				    {8000,9000}
				    }; // Practice
		
		
		for(int array[]:c)
			for(int z:array)
		{
	       System.out.print(z+"   ");
		}
		{
			System.out.println(); // if we want to print values in box type 
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	   
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
