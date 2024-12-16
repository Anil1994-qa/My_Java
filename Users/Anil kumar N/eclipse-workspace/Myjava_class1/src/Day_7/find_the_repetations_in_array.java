package Day_7;

public class find_the_repetations_in_array {

	public static void main(String[] args) {
		
		int []v= {100,200,100,300,100,400,100,200,100,100};
		int num=100;  // we have to create a variable to search a repeated number
	    int count=0;
		for(int value:v)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("Repetaion of the number in an array:"+count);
		
		
		

	}

}
