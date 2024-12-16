package Day_7;

public class Min_num_in_array {

	public static void main(String[] args) {
		
		int a[]= {5,10,30,1,103,49,949};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			min=a[i];
		}
          System.out.println("Min number in an array:"+min);
	}

}
