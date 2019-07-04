
package practice1;


class Outer
{
   int num;
   
   
  public class Inner 
   {
      public void print()
      {
         System.out.println("This is an inner class");
      }
   }
  
}
public class InnerClass {
     public static void main(String args[]) {
   
         Outer ob=new Outer();
      Outer.Inner inner = ob.new Inner();
    inner.print();
     
    
   }
}


   

