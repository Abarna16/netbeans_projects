import java.util.Scanner;
public class Copy {
public static void main(String args[])
{
    String value1,value2="";
    //int i=0;
    Scanner object=new Scanner(System.in);
     value1=object.nextLine();
     for(char i:value1.toCharArray())
         value2=value2+i;
     System.out.println("The new string is "+value2);
    
}
}