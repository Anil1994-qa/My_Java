package Day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder add=new Adder();
		add.sum();// 01 method

        add.sum(200,200);// 2nd method

        add.sum(10.5, 25); // 4th method
        
        add.sum(45,15.25); // 3rd method
        
        add.sum(25,35,245);// 5th method
        
        
        add.sum(20, 30);
	}

}
