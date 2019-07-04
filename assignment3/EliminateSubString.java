
package assignment3;

import java.util.Scanner;

public class EliminateSubString {
     public static void main(String args[])
    {
      String value1,value2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String ");
        value1=scanner.nextLine();
         System.out.println("Enter SubString");
        value2=scanner.nextLine();
         System.out.println("Before Eliminating substring: "+value1);
        value1=value1.replaceAll(value2,"");
        System.out.println("After Eliminating substring: "+value1);
    }
}
