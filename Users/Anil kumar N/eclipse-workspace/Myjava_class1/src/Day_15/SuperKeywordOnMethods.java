package Day_15;

class Bike
 {
   String B="Red";
   
	void Bike()
	{
	System.out.println(B+" - "+"Tvs Star City");
	}
}

class NewBike extends Bike
{
	String B="White";
	void Bike()
	{
		//System.out.println(B+" - "+"Bajaj pulsur NS 200");
		super.Bike();
	}
}

public class SuperKeywordOnMethods {

	public static void main(String[] args) {
	NewBike a= new NewBike();
	a.Bike();

	}

}
