package Day_9;

public class remove_junkOr_special_chart_in_a_String {
public static void main(String[] args) {
	
	String s="#$&^#&# Anil java string 01234567890";
	s=s.replaceAll("[^a-z A-Z 0-9]",""); //replace all is a regular expression we can use to remove junk and spaces in string
	System.out.println(s);
	
	
		
	}

}
