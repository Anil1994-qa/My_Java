package Day_13;

public class ThisKeyword {
	
	int x,y; // class or instance variables which created under class field
	
	/*ThisKeyword(int x, int y)
	{
		this.x=x;
		this.y=y;  // this keyword represents the class variable
	}*/
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	void Setdata(int a, int b)
	{
		x=a;
		y=b;
	}
	
	
	
	
	

	public static void main(String[] args) {
		//ThisKeyword th=new ThisKeyword(500,200);
		//th.display();
		
		ThisKeyword th1= new ThisKeyword();
		th1.Setdata(400, 600);
        th1.display();
	}

}
