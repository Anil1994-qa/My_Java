package Day_10;

public class oops_employee { //----This is the class
	//Variable
	int employee_id;
	String employee_name;
	String job;
	int salary;
	
	// Methods
	void display()
	{
	System.out.println(employee_id);
	System.out.println(employee_name);
	System.out.println(job);
	System.out.println(salary);
	}
	public static void main(String[] args) {
		{
			oops_employee emp1=new oops_employee(); // Object
			emp1.employee_id=101;
			emp1.employee_name="Anil kumar N";
			emp1.job="Test engineer";
			emp1.salary=45000;
			emp1.display();

            oops_employee emp2=new oops_employee();
            emp2.employee_id=102;
            emp2.employee_name="Neemashree";
            emp2.job="Research Analysist";
            emp2.salary=25000;
            emp2.display();
            		
		}

	}

}
