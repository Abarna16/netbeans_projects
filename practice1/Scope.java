/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author Administrator
 */
public class Scope {
  
    int x,y;
    static int result=16;
    void add(int a,int b)
    {
        x=a;
        y=b;
        int sum=x+y;
        System.out.println("local variable"+sum);
         
        System.out.println("Instance variable "+x+" "+y);
        

    }
    

	public static void main(String[] args)
	{
            Scope ob=new Scope();
            ob.add(3,4);
		System.out.println("static variable "+result);
		
	}
       
}
