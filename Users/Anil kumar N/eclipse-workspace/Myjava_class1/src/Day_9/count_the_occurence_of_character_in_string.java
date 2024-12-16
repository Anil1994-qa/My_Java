package Day_9;

public class count_the_occurence_of_character_in_string {

	public static void main(String[] args) {
		
		String a="java programming java oops abababababababababababa";
		int total=a.length();// first need to know the total length of string
		int after_removing=a.replaceAll("a", "").length(); // this is also total length after removing a
		int count=total-after_removing;
		System.out.println("the total number of a:"+count);

		
		
		String b="abavabavacbaababavanavacabavsbdndvavababav";
		int org_length=b.length();
		int remove= b.replaceAll("a", "").length();
		int repeat=org_length-remove;
		System.out.println("Repetaions of a in a string:"+repeat);
		

		
	}

}
