package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program is started");
        System.out.println("Programm in progress");
        
        Thread.sleep(5000);
        
        FileInputStream file=new FileInputStream("c:\\Text.txt");
        
        System.out.println("Program is Completed");
		System.out.println("Program is exited..");

	}

}
