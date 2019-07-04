
package assignment5;
import java.util.Scanner;
class newException extends Exception
{
    newException(String a)
    {
        super(a);
    }
}
public class UserDefine
{
    static void fun(int a)  throws newException
    {
        if(a<18)
           throw new newException("Invalid ");
        else
            System.out.println("valid");
    }
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        int a=object.nextInt();
        try
        {
        fun(a);
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}
