package Day_7;

public class Missing_number_In_array {

	public static void main(String[] args) {
		
		int a[]= {10,11,12,13,14,16,17,18,19,20};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements:"+sum1);
		// steps - sum2 is based on the first element(a[0]) and last element(a[a.length-1])
		int sum2=0;
		for(int i=a[0];i<=a[a.length-1];i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in an array:"+sum2);
		
		System.out.println("Missing element in an array:"+(sum2-sum1));
		
		
		
		
		
          
	}

}
