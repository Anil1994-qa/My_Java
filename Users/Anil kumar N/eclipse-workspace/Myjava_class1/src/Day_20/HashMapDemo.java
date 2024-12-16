package Day_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
public static void main(String[] args) {
	
	//Declaration of an Hashmap
	HashMap<Integer,String> hm=new<Integer,String>HashMap(); //Here keys are integers and values are Strings
	
	//How to Add pairs
	hm.put(101, "Anil");
	hm.put(102, "Sunil");
	hm.put(103, "Amma");
	hm.put(104, "Appa");
	hm.put(101, "No name");
	hm.put(106, "Neema");
	
	
	System.out.println(hm); //{101=No name, 102=Sunil, 103=Amma, 104=Appa, 106=Neema}
	
	
	//size of an hashmap
	System.out.println("Size of an HashMap:"+hm.size());
	
	
	//Remove pairs
	hm.remove(101); //101 is key of the pair
	System.out.println("After removing Key"+hm);  //{102=Sunil, 103=Amma, 104=Appa, 106=Neema}
	
	//Access particular pairs
	hm.get(106); //106 is key
	System.out.println(hm.get(106));
	
	//Get all the keys/ values from hashmap
	System.out.println("Keys of Hashmap: "+hm.keySet());
	System.out.println("Values of HashMap: "+hm.values());
	System.out.println("HashMap along with keys & values: "+hm.entrySet());//HashMap along with keys & values
	
	//Reading all the values from HashMap(normal for loop is not possible)
	
	//Approach 01-- Using for each loop
	for(int k:hm.keySet()) {
		System.out.println(k+"    "+hm.get(k));	
	}
		
    //Approach 02 --using Iterator
		
		Iterator<Entry<Integer, String>>i=hm.entrySet().iterator();	
	  while(i.hasNext()) {
		  Entry<Integer, String>entry=i.next();                                   //System.out.println(i.next());
		  System.out.println(entry.getKey()+"   "+entry.getValue());
		  
		  //Clear all the pairs 
		  hm.clear();
         System.out.println(hm.isEmpty()); //true
	  }
	
	}

}
