package practice1;

import java.util.Scanner;

public class StringExample {
    public static void main(String args[])
    {
        String value;
        Scanner scanner=new Scanner(System.in);
        value=scanner.nextLine();
        System.out.println(value.length());
         
         System.out.println(value.charAt(0));
          System.out.println(value.isEmpty());
           System.out.println(value.indexOf('e',3));
            System.out.println(value.lastIndexOf('e'));
            
//           for(char i:value.toCharArray())
//               System.out.println(i);
           System.out.println(value.replace('a','e'));
           System.out.println(String.join("-","hi","hello","xx","yy"));
          
    }
}
