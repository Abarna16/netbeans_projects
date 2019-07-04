import java.util.Iterator;
import java.util.Scanner;

public class Length {
    public static void main(String args[])
    {
        String value;
        int len,i=0;
        Scanner object=new Scanner(System.in);
        value=new String(object.nextLine());
        for(char val:value.toCharArray())
        i++;
        System.out.println("length of the String is "+i);
            
        
    }
}