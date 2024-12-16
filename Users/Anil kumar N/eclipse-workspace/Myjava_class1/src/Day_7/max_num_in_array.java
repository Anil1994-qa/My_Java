package Day_7;

public class max_num_in_array {

	public static void main(String[] args) {
		
		int a[]= {25,857,95785,8575,745474,83646,9548,958};
		int max=a[0];
		for(int b=0;b<a.length;b++)
			if(max<a[b])
		      max=a[b];
		{
			System.out.println("max number in an array:"+max);
		}
		     
		int b[]= {250099,857,95785,8575,745474,83646,9548,958};
		int max1=b[0];
		for(int c=0; c<b.length;c++)		
			if(max1<b[c])
				max=b[c];
		System.out.println("max number in an array:"+max1);

	}

}
