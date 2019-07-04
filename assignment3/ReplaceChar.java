
package assignment3;

import java.util.Scanner;

public class ReplaceChar {
     public static void main(String args[])
    {
        String value1,value2,value3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String ");
        value1=scanner.nextLine();
         System.out.println("Enter  char to be replaced ");
        value2=scanner.nextLine();
         System.out.println("Enter char to be replace");
        value3=scanner.nextLine();
        value1=value1.replaceAll(value2,value3);
         System.out.println(value1);
}
}