package order;
import java.util.*;
import java.text.*;
import java.lang.*;

public class Update {
   long c=0;
    long adtime=0,usertime=0;
    String item;
    int price;
    Update(String item,int price)
    {
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
                            Date date = new Date();  
                                  adtime=date.getTime();
                            
    int hr=date.getHours();
                                    int min=date.getMinutes();
                                    int s1=date.getSeconds()+(min*60)+(hr*3600);
                                    c=(s1+60)-s1;
                                  
               this.item=item;
               this.price=price;
                                    System.out.println(86400-s1);
        }  
    Update()
    {
//        Object xa=new String("ss");
//                Integer a=(Integer)xa;
    }
  public void fun(ArrayList<Item> it)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
                            Date date2 = new Date();  
                                  usertime=date2.getTime();
                            
    
  
    long dif= (usertime-adtime)/1000;
  //  return dif;
    System.out.println(c+" "+dif);
    if(dif>=c)
    {
        
    
  
                        for(Item i:it)
                                    {
                                        if(i.name.equalsIgnoreCase(item))
                                        {
                                            i.price=price;
                                           
                                             // System.out.println("New price of "+item+" is "+i.price);
                                            //System.out.println("Available quantity"+i.);
                                            break;
                                        }
                                       
                                    }
    }
    }
}
