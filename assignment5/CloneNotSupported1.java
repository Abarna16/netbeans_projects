
package assignment5;

public class CloneNotSupported1 implements Cloneable {
     private int a=90;
    public static void main(String args[])
    {
       
        CloneNotSupported1 object1=new CloneNotSupported1();
        try
        {
            CloneNotSupported1 object2=(CloneNotSupported1)object1.clone();
            System.out.println("No Exception");
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }   
        
          
          
    }
}
