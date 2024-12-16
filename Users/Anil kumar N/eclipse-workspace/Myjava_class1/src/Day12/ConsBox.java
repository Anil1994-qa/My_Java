package Day12;

public class ConsBox {
	
	double width, height, depth;
	
	ConsBox() //1
	{
		/*width=0;
		height=0;  ----We can write like this also
		dept=0;*/
		width=height=depth=0;
	}
	ConsBox(double w, double h, double d) //2
	{
		width=w;
		height=h; 
		depth=d;
	}
     ConsBox(double len) //3
     {
    	 width=height=depth=len;
     }
     double volume()
     {
    	return (width*height*depth);
     }
}
