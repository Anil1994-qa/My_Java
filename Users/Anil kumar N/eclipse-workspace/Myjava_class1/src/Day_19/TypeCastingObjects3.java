package Day_19;

//A b=(C) d;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		/*
	//	Ex 01
	 Object o=new String("Anil");
	 StringBuffer sb=(StringBuffer) o;  //rule1-yes ,rule2-yes,rule3-fail
	 
	 //Ex02
	 String s=new String("Sunil");
	 StringBuffer sb1=(StringBuffer) s;  //Rule1-failed
	 
	 //Ex03
	 Object o1=new String("Ammaa");
	 StringBuffer sb2=(StringBuffer) o; //rule1-yes ,rule2-yes,rule3-fail

	 //Ex04
	 Object o2=new String("Appaa");
	 StringBuffer sb3=(String) o2;   //rule1-passes, rule2-failed
	 
	 //Ex05
	 String s1=new String("Java Automation");
	 StringBuffer sb4=(String) s1;    //rule1-passes, rule2-failed
	 
	 //Ex06
	 Object o3=new String("");
	 StringBuffer sb5=(StringBuffer) o3; //Rule01-Pass, Rule02-Passed, Rule3-failed
	  */
	 //Ex07
	 Object o4=new String("Anil Automation");
	 String s3=(String) o4; //Rule01-Pass, Rule02-Passed, Rule3-Passed
	System.out.println(s3);
	}

}
