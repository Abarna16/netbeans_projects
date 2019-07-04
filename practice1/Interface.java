
package practice1;
interface Printable
{  
  
void print1(); //public abstract
default void display1()
{
    System.out.println("This is default method");
}
 static void display() 
    { 
        System.out.println("This is Static method"); 
    } 
}  
interface Showable
{  
      int a=10;
void print2(); 
//a=40; //public static final(so assignment will throw error//
}  
public class Interface implements Printable,Showable{  
public void print1(){System.out.println("Interface 1");}  
public void print2(){System.out.println("Interfaace 2");}  
  
public static void main(String args[]){
    Printable.display();
   
Interface obj = new Interface();  
obj.print1();  
obj.print2(); 
obj.display1();
 }  
}  

