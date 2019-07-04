import java.util.Scanner;
public class SortingArray {
public static void main(String args[])
{
    int i,nElements,temp,j;
    int[] array=new int[100];
    Scanner object=new Scanner(System.in);
    nElements=object.nextInt();
    for(i = 0; i < nElements; i++)
    
    {
        array[i]=object.nextInt();
    }
      for(i = 0; i < nElements-1; i++)
    
    {
        for(j=i+1;j<nElements;j++)
        {
            if(array[i]>array[j])
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
      System.out.println("Accending order of array Elements");
       for(i = 0; i < nElements; i++)
    {
    System.out.println(array[i]);
    }
    
}
}
