import java.util.Scanner;
public class Concat {
public static void main(String args[])
{
    String value1,value2;
    //int i=0;
    Scanner object=new Scanner(System.in);
    System.out.println("Enter String 1");
     value1=object.nextLine();
     System.out.println("Enter String 2");
     value2=object.nextLine();
     for(char i:value2.toCharArray())
         value1=value1+i;
     System.out.println("The new string is "+value1);
    
}
}