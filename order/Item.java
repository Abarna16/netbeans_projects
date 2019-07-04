package order;
public class Item {
   String name;
   int quantity;
   int price;
 Item(String item_name,int quan,int price) 
{
this.name=item_name;
this.quantity=quan;
this.price=price;
   
}
  public String getName()
    {
        return this.name;
    }
     public int getQuantity()
    {
        return this.quantity;
    }
      public int getPrice()
    {
        return this.price;
    }
   @Override
 public String toString()
 {
    return this.name+" "+this.quantity+" "+this.price+"\n";
 }
}

