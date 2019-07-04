
package assignment5;
//import java.lang.Exception;
public class ClassNotFound {
    public static void main(String args[])
    {
        try
        {
            Class.forName("Assignment4.Arithmetic1");
            System.out.println("no exception");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
    }
}
