
package order;


public class Sample {
    
     String name;
    int price;
    Sample(String item_name,int price) 
{
this.name=item_name;

this.price=price;
   
}
  @Override
 public String toString()
 {
    return this.name+" "+this.price+"\n";
 }
    
}
