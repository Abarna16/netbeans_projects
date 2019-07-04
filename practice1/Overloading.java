
package practice1;

public class Overloading {
  
    public void disp(char c)//single arguement
    {
         System.out.println(c);
    }
    public void disp(char c, int num) // differ in number of arguement
    {
         System.out.println(c + " "+num);
        
    }
      public void disp(int num, char c) //differ in sequence of arguement 
    {
         System.out.println(num + " "+c);
        
    }
}
class Sample
{
   public static void main(String args[])
   {
       Overloading obj = new Overloading();
       obj.disp('a');
       obj.disp('a',10);
       obj.disp(6,'a');
   }
}

