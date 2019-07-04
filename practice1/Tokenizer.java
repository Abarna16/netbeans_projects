package practice1;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Tokenizer {
    public static void main(String args[])
    {
         String string,delimiter;
        Scanner scanner=new Scanner(System.in);
       //string=scanner.nextLine();
      //delimiter=scanner.nextLine();
        StringTokenizer tokenizer=new StringTokenizer("hi:how:are:you",":",true);
        System.out.println(tokenizer.countTokens());
        while(tokenizer.hasMoreTokens())
        System.out.println(tokenizer.nextToken());
    }
}
