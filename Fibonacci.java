 import java.util.Scanner;
public class Fibonacci {
   

    static int num1=0,num2=1,num3=0;
    public static void findFibonacci(int number)
    {   
     if(number>0)
        {
           System.out.print(num1);
            num3=num1+num2;
            num1=num2;
            num2=num3;
             
            findFibonacci(--number);
        }
        
    }
  public static void main(String  args[])  
  {
      int number1;
      Scanner object=new Scanner(System.in);
      number1=object.nextInt();
       System.out.println("Fibonacci series ");
     findFibonacci(number1);
    
  }
}


