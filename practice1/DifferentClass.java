
package practice1;
//Different class and same pakage
public class DifferentClass {
    
     public static void main(String args[])
    {
       DifferentClass ob=new DifferentClass();
         ob.show();
    }
     void show()
    {
         AccessSpecifier object1=new AccessSpecifier();
      // System.out.println("private variable"+object1.a);
         System.out.println("protected variable"+object1.b);
          System.out.println("public variable"+object1.c);
           System.out.println("default variable"+object1.d);
          
         
    }
}
