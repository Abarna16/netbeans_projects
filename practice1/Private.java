
package practice1;
import java.io.*; 
public class Private {
    
	static Private instance = null; 
	protected int x = 10; 
	
	
	private Private() { } 

	
	static public Private getInstance() 
	{ 
           
		if (instance == null)		 
			instance = new Private(); 

		return instance; 
	} 
        {
              x=x+0;
        }
} 


class Main 
{ 
public static void main(String args[])	 
{ 
	Private a =Private.getInstance(); 
	Private b =Private.getInstance(); 
	a.x = a.x + 10; 
	System.out.println("Value of a.x = " + a.x); 
	System.out.println("Value of b.x = " + b.x); 
}	 
} 


