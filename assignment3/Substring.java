
package assignment3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Substring {
     public static void main(String args[])
    {
      String value1,value2;
     int i,j=0,k,count,len1,len2,c=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String ");
        value1=scanner.nextLine();
         System.out.println("Enter SubString");
        value2=scanner.nextLine();
        len1=value1.length();
        len2=value2.length();
        char a[]=value1.toCharArray();
        char b[]=value2.toCharArray();
        
        /*
        #without using string methods
        for(i=0;i<len1;i++)
        {
           
                if(a[i]==b[j])
                {
                  count=1;
                    for(k=i+1;k<len1;k++)
                    {
                           j++;
                        if(j<len2)
                        {
                     
                        if(a[k]==b[j])
                            count++;
                        }
                    }
                    if(count==len2)
                        c++;
                        
                }
            j=0;
        }*/
/*   #using regular expression
Pattern p=Pattern.compile(value2);
Matcher m=p.matcher(value1);
while(m.find())
    c++;
*/
 int count1 = 0, fromIndex = 0;
    while ((fromIndex = value1.indexOf(value2, fromIndex)) != -1 ){

            count1++;
            fromIndex++;
            
        }
System.out.println("Number of occurances "+count1);
    }
}
