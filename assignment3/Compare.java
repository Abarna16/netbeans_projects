package assignment3;
import java.util.Scanner;
public class Compare {
    public static void main(String args[])
    {
        String value1,value2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String 1");
        value1=scanner.nextLine();
        System.out.println("Enter String 1");
        value2=scanner.nextLine();
        String a=(value1.equals(value2)) ? "Two strings are equal": "Two strings are not equal";//without ignoreCase
        System.out.println(a); 
        String b=(value1.equalsIgnoreCase(value2)) ? "Two strings are equal": "Two strings are not equal";//with ignoreCase
        System.out.println(b); 
       
    }
}
