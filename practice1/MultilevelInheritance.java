
package practice1;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
   private int a=10;
	protected void fun1() 
	{ 
		System.out.print("hi! "); 
	} 
} 

class two extends one 
{ 
	public void fun2() 
	{ 
		System.out.print("how are "); 
	} 
} 

class three extends two 
{ 
	public void fun3() 
	{ 
		System.out.println("you "); 
	} 
} 


public class MultilevelInheritance 
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.fun1(); 
		g.fun2(); 
		g.fun3(); 
                two ob=new two();
                ob.fun1();
                ob.fun2();
                
	} 
} 


