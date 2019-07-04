import java.util.Scanner;
public class FindBiggestNUmber {
public static void main(String args[])
{
    int i,nElements,maxValue=0;
    int[] array=new int[100];
    Scanner object=new Scanner(System.in);
    nElements=object.nextInt();
    for(i = 0; i < nElements; i++)
    
    {
        array[i]=object.nextInt();
        if(maxValue < array[i])
            maxValue=array[i];
    }
    System.out.println("Biggest Element in the array : " + maxValue);
    
}
}
