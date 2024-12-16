package Day_11;

public class Student {
	
    int sid;
	String sname;
	char grad;
	
	void setstudata(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	void printstudata()
	{
		System.out.println(sid+"  "+sname+"  "+"  "+grad);
	}
	
	Student(int id, String name, char gr) // Constructor
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    	
	public static void main(String[] args) {
     Student st=new Student(102, "Neema", 'A');
    /* st.setstudata(1001, "Anil Kumar N", 'A');
    /* st.sid=101;
     st.sname="Sunil";
     st.grad='B';
    st.printstudata();
    */
     st.printstudata();


	}
	

}
