
package practice1;




public class PrivateClass { 
    private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   public static void main(String args[]) {
     
   
      
       PrivateClass.Inner_Demo inner =new PrivateClass().new Inner_Demo();
      inner.print();
      
   }
}

