package Day_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetdemo {

	public static void main(String[] args) {
	//Declaration of HashSet
		
		HashSet myset= new HashSet();
		Set myset1=new HashSet();
		
		HashSet<String>myset2= new HashSet<String>();
		
		//Adding elements into HashSet
	     myset.add('A');
	     myset.add(100);
	     myset.add(12.5);
	     myset.add("Welcome to java");
	     myset.add(100);
	     myset.add(true);
	     myset.add(null);
	     myset.add(null);
	     
	     //Printing HashSet
	     System.out.println(myset);  //[null, A, 100, 12.5, Welcome to java, true]//---  insertion order is not allowed
	                                                                             //--Duplicates are not Allowed
	     
	      //Size of hashset
	      System.out.println("Size of an hashset is:"+myset.size()); //size is 6 and duplicates are not considered

	    //Remove element from HashSet                                                                         //--Multiple nulls are also not available
	     myset.remove(100); //we have to specify the element
	     System.out.println("After removing the element from hashSet :"+myset); //[null, A, 12.5, Welcome to java, true]
	     
		//Inserting element is not possible in HashSet(Set collection)   --there is no direct approach
	    //Accessing the specific element is also not possible   --there is no direct approach
	     
	    //Convert hasSet to ArrayList 
	     
	     ArrayList Al=new ArrayList(myset);
	      System.out.println("After converting into ArrayList: "+Al);//[null, A, 12.5, Welcome to java, true]
	      
	      System.out.println(Al.get(3)); // we can convert into aArrylist than we can able to access a specific element
	      
	     //Read all the elements using only enhanced for loop(normal for loop is not possible because there no index)
	      
	    /*  for(Object M:myset) {
	    	  System.out.println(M);
	      }
	      */
	      
	      //Read all the elements using iterator
	      
	      Iterator it=myset.iterator();	      
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	   //Clearing all the elemets in hashset   
	      myset.clear();
	      System.out.println(myset.isEmpty()); //return as true since the hashset is cleared
	      
	      //We do not have get method in hashset
	      
	      
	}

}
