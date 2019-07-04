import java.util.Scanner;

public class Palindrome {
    static int flag=0;
    public static int isPalindrome(String value,int start,int end)
    {   
     if(end>=(end+1)/2)
     {
         if(value.charAt(start)!=value.charAt(end))
         {
             flag=1;
             return flag;
         }
         isPalindrome(value,start+1,end-1);
     }
        
       return flag; 
        
    }
  public static void main(String  args[])  
  {
      String value;
      int flag,length;
      Scanner object=new Scanner(System.in);
      value=object.next();
      length=value.length();
      flag=isPalindrome(value,0,length-1);
      if(flag==1)
     System.out.println(value+" is Not a Palindrome");
      else
          System.out.println(value+" is Palindrome");
             
}
}