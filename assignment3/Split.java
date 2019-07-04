
package assignment3;

import java.util.Scanner;

public class Split {
     public static void main(String args[])
    {
        String value1,value2,value3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String ");
        value1=scanner.nextLine();
        String a[]=value1.split(" ",2);
        for(String b:a)
        System.out.println(b);
    }
}
