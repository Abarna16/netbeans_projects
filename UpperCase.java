
import java.util.Scanner;


public class UpperCase {
    public static void main(String args[])
    {
        int i,upper=0,lower=0,digit=0,specialChar=0,length;
        String value;
      
        Scanner object=new Scanner(System.in);
        value=object.nextLine();
          char a[]=value.toCharArray();
          length=a.length;
          for(i=0;i<length;i++)
          {
              if(a[i]>='a'&&a[i]<='z')
                  lower++;
              else if(a[i]>='A'&&a[i]<='Z')
                  upper++;
              else if(a[i]>=48&&a[i]<=57)
                  digit++;
              else
                  specialChar++;
          }
          System.out.println("Number of lower case letters : "+lower+"\nNumber of upper Case letters :"+upper+"\nNUmber of digits :"+digit+"\nNumber of special character :"+specialChar);
        
        
    }
}
