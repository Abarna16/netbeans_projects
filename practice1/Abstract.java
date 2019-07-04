
package practice1;


 abstract class Base { 
   void fun2()
   {
   System.out.println("this is non abstract method");
   }
    abstract void fun(); 
    final void fun1() { System.out.println("This is final method"); } 
} 
class Derived extends Base { 
   
    void fun() { System.out.println("This is abstract method"); } 
} 
public class Abstract {
    public static void main(String args[]) {  
       Derived d = new Derived(); 
       d.fun();
       d.fun1();
       d.fun2();
    } 
} 

