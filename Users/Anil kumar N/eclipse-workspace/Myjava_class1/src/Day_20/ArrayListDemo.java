package Day_20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
/*	
	How to create ArryList(If we want to store heterogeneous data than go with below syntax)
	ArrayList list = new ArrayList();
	List mylist1=new ArrayList ();
	
	
    If we want to store only homogeneous data than go with below syntax
	ArrayList<String> S=new ArrayList<String>();  //This will only store Strings
	ArrayList<Integer> S1=new ArrayList<Integer>(); //This will only store integers
	
	*/
	
	ArrayList mylist = new ArrayList();
	//Adding data into ArryList
	mylist.add(100);
	mylist.add(10.5);
	mylist.add("Welcome to java Automation");
	mylist.add('A');
	mylist.add(true);
	mylist.add(null);
	mylist.add(null); //Multiple nulls allowed
	mylist.add(100); //Duplicate is allowed
	
	//size of ArrayList
	System.out.println("Size of an ArryList is :"+mylist.size());
	
	
	//Printing ArryList
	System.out.println("Printing data from ArryList :"+mylist);
	
		
	//Remove some elements from ArryList
	mylist.remove(7); //7 is index of element
	System.out.println("After Removing from ArryList:"+mylist);
	
	
	//Insert element in the ArrysList(in the middle of the Arraylist if i want insert)
	mylist.add(3, "with Selenium");
	System.out.println("After inserting element : "+mylist);
	
	
	//Modify/replace/change elements in ArrayList
	mylist.set(2, "Java web automation");
	System.out.println("After modifying the element : "+mylist);
	
	
	//Access specific element from an array
	mylist.get(3);
	System.out.println(mylist.get(3)); // 3 is index
	
	//How to read all the elements in an arraylist--imp
	//Approach 01-- Using normal for loop
	for(int i=0; i<mylist.size();i++) {
		System.out.println(mylist.get(i));
	}
	//Approach 02-- Enhanced for loop
	for(Object X:mylist) {   //Object keyword can hold all type of data
		System.out.println(X);
	}
	//Approach 03---It's specific to collections--Using iterator
	
	Iterator it=mylist.iterator(); //When ever using iterator we need to go with while loop
	
	while(it.hasNext()) { // hasNext() is method through which we can check the element exist or not
     System.out.println(it.next()); // next() is a method this will get the particular element from the arraylist
	}
	
	//Checking ArrayList is empty or not
	System.out.println("Is my ArrayList is empty :"+mylist.isEmpty());
	
	
	//If i want remove all the elements from arraylist
	
	ArrayList mylist1=new ArrayList(); 
	mylist1.add(null);
	mylist1.add("with selenium");
	mylist1.add("Java web automation");
	mylist1.add(10.5);
	
	mylist.removeAll(mylist1); //from mylist i'm removing all the elements which are present in the mylist1
	System.out.println("Remove few elemets from arrayList"+mylist);
	
	
	/*remove all the elements/clear
	mylist.clear();
	System.out.println("Is my ArrayList is empty :"+mylist.isEmpty());  It will return as true
	*/
	
	
	//These are all different operations we can do with arraylist
	}

}
