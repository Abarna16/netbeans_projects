package assignment3;

import java.util.Scanner;
import java.util.*;
public class RemoveNumeric {
    public static void main(String args[])
    {
        String value1,x="";
       
        int length,i
                ;
        Scanner scanner=new Scanner(System.in);
        value1=scanner.nextLine();
       length=value1.length();
      for(i=0;i<length;i++)
        {
            int n=value1.charAt(i);
          if(!(n>=48 && n<=57)){
              
           x=x+(char)value1.charAt(i);
             
          }
        }
      System.out.println(x);
      
     /*using regular expression
        
            String a=value1.replaceAll("[0-9]", "");
          System.out.println(a);
        */
     
    /* #using string class
            value1=value1.replaceAll("\\d","");
             System.out.println(value1);
     */
}
}