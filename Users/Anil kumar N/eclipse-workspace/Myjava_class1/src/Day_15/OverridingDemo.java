package Day_15;

 class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 12.5;
	}
}
public class OverridingDemo {
public static void main(String[] args) {
	
	ICICI ic= new ICICI();
	System.out.println("Rate of intreset in icici-" +ic.roi());
		
    SBI sb=new SBI();
    System.out.println("Rate of intreset in sbi-"+sb.roi());
	
	}

}
