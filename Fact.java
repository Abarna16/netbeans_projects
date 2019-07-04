import java.util.Scanner;

public class Fact {
static int num1=0,num2=1,num3=0;
    public static int findFactorial(int number)
    {   
     if(number==0||number==1)
         return 1;
     else
         return number*findFactorial(number-1);
        
        
        
    }
  public static void main(String  args[])  
  {
      int number1;
      Scanner object=new Scanner(System.in);
      number1=object.nextInt();
      
     
     System.out.println("Factorial of "+number1+" is "+findFactorial(number1));
             
}
}

