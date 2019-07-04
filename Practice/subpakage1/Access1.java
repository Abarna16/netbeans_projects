package practice.subpakage1;

import practice1.AccessSpecifier;
import assignment3.Access;
//other pakage && different class
public class Access1 
{
  public static void main(String args[])
    {
        Access1 a=new Access1();
        a.show();
    }
    void show()
    {
        AccessSpecifier object1=new AccessSpecifier();
        // System.out.println("private variable"+object1.a);
        // System.out.println("protected variable"+b);
          System.out.println("public variable"+object1.c);
          // System.out.println("default variable"+d); 
    }
    
}
