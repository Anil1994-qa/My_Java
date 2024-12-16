package Day_15;

//super class    // only comes in inheritance

// Super key word is always representing immediate parent class

class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";

	void Display()
	{
	System.out.println(super.color); // if we use super key word it will give the value of parent class
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog bow= new Dog();
		bow.Display();
		
		
		

	}

}
