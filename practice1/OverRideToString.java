/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;


public class OverRideToString {
     String name;
        int rollNumber;
     public OverRideToString(String name1,int rollNumber1)
       {
           name=name1;
         rollNumber=rollNumber1;
       }
    public String toString()
    {
        return this.name+" "+this.rollNumber;
    }
    public static void main(String args[])
    {
       
      OverRideToString object=new OverRideToString("abarna",1601003);
      System.out.println(object);
    }
}
