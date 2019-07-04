
package practice1;

public class Overriding {
    public static void main(String[] args) 
	{ 
		Parent obj1 = new Parent(); 
		obj1.m2(); 
              
		Parent obj2 = new Child(); 
		obj2.m2(); 
                System.out.println(obj2.a);
                
	}
}
    class Parent 
{ 
        int a=90;
	private void m1() { System.out.println("From parent m1()");} //cannot be override private method
	
	protected void m2() { System.out.println("From parent m2()"); } 
} 

class Child extends Parent 
{ 
	int b=89;
	private void m1() { System.out.println("From child m1()");} //newly created method
	
	
	
	public void m2() { System.out.println("From child m2()");} 
	
} 


	

