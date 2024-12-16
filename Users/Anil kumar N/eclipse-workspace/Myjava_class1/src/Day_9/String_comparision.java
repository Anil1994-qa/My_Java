package Day_9;

public class String_comparision {

	public static void main(String[] args) {
		// Case 1
        String s1="Automation";
        String s2="Automation";
        System.out.println(s1==s2);// true
        System.out.println(s1.equals(s2)); // true
        
        
        // Case 2 by (using new keyword)
        String s3=new String("Anil");
        String s4=new String("Anil");
        System.out.println(s3==s4); // false // to compare the objects(when new keyword is used, the object of an string created separately while using  == it will only compare the objects but not the values that is stored in the object)
        System.out.println(s3.equals(s4)); // true // to compare the values of the object
        
        
        // Case 03
        String s5="Neemashree";
        String s6=new String("Neemashree");
        
        System.out.println(s5==s6);// objects are not same so false
        System.out.println(s5.equals(s6));// equals compares the values in the object
        
        
        // case 04
        String s7="Sunil";
        String s8=new String("Sunil");
        String s9=s8;
        
        System.out.println(s7==s8); // false
        System.out.println(s7.equals(s8)); //true
        System.out.println(s8==s9); // true becoz objects are same/
        System.out.println(s8.equals(s9)); // true
        
        // interview questions
        
	}

}
