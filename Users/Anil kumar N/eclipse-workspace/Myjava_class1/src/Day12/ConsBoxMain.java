package Day12;

public class ConsBoxMain {

	public static void main(String[] args) {
		
	//ConsBox b= new ConsBox(); // this will invoke default method 
	//ConsBox b= new ConsBox(10.5,12.5,14.5);// this will invoke 2nd methos
		ConsBox b= new ConsBox(10.5);	// 3rd method
		
	    System.out.println(b.volume());

	}

}
  