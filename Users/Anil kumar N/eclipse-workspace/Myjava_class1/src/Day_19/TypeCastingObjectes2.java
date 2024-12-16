package Day_19;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}





public class TypeCastingObjectes2 {
public static void main(String[] args) {	
// When ever we are doing type casting need to follow 3 rules
     
      
   /* Cat ct=(Cat)An;
       A   B    C  D
      
      Rule no 1: Conversion is valid or not   
      The type of 'D' and 'C' must have some relationship(either parent to child or child to Parent)
      */
	 Animal An = new Dog ();
      Cat ct=(Cat)An; // valid as per rule 1
      
      // EX 02
      
   /* Dog dg=new Dog();
      Cat ct1=(Cat) dg; */  // invalid as per rule 1
      
     /*Rule 2 : Assignment is valid or not
      'C' must be either same or child of 'A'
      */
      
      Animal An1=new Dog();
      Cat ct1=(Cat) An1;  //valid as per rule 02
      
      Animal An2= new Dog();
     // Cat ct2=(Dog) An2;      invalid as per Rule 2
      
      
    /*  Rule 3 
     THe underlying object type of 'd' must be either same or child of 'c'
     
      Animal An3=new Dog();
      Cat ct3=(Cat) An3;  //invalid as per rule 3
      */
      //Rule 1, rule 2, rule 03
      Animal An4=new Dog(); //Rule 1--yes, rule 2 -- Yes,  rule-3--yes
      Dog dg2=(Dog) An4;
	}

}
