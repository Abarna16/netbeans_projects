package assignment3;
import practice1.AccessSpecifier;

//derived class && other pakage 
public class Access extends AccessSpecifier{
    public static void main(String args[])
    {
        Access a=new Access();
        a.show();
    }
    void show()
    {
       
    //System.out.println("private variable"+a);
         System.out.println("protected variable "+b);
          System.out.println("public variable "+c);
       // System.out.println("default variable"+d); 
    }
}
