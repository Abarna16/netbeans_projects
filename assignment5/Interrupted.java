
package assignment5;
public class Interrupted{
  public static void main(String args[]) 
	{ 
		Thread t = new Thread(); 
	try{	
  t.sleep(10000); 
    }
  catch(InterruptedException e)
  {
    System.out.println(e);
  }
  finally
  {
     System.out.println("hi");
  }
	} 
}
