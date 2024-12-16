package Day_8;

public class String_methods_3 {

	public static void main(String[] args) {
		String s="Welcome";
		String rev=" ";
		for(int c=s.length()-1;c<=0;c--)
		rev=rev+(s.charAt(c));
		System.out.println(rev);
		
	}

}
