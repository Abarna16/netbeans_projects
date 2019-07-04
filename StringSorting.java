
public class StringSorting {
public static void main(String args[])
{
    String value1[]={"abarna","Bala","jayanth"},c;
    int i,j,length;
  
    length=value1.length;
    for(i=0;i<length-1;i++)
    {
        for(j=i+1;j<length;j++)
        {
            if((value1[i].compareToIgnoreCase(value1[j]))>0)
            {
                 c=value1[i];
                value1[i]=value1[j];
                value1[j]=c;
            }
        }
    }
    for(i=0;i<length;i++)
        System.out.print(value1[i]+" ");
}
}
