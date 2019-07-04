/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;


public class Example {
   
 
	
	int length;
	int breadth;
	int height;
     Example(int length,int breadth,int height)
        {
            this.length=length;
            this.breadth=breadth;
            this.height=height;
        }
	public int getVolume()
        {
		return (length * breadth * height);
	}

         public static void main(String args[])
    {
       
      Example object=new Example(2,3,4);
      System.out.println(object.getVolume());
    }
}

