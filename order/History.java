package order;
public class History {
    String name;
    int quantity;
    int cost;
    History(String item_name,int quan,int price) 
{
this.name=item_name;
this.quantity=quan;
this.cost=price;
   
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
        return this.cost;
    }
    @Override
 public String toString()
 {
    return "name:"+this.name+"\nquantity:"+this.quantity+"\nprice:"+this.cost+"\n";
 }
    
    
}



