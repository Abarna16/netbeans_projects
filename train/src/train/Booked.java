
package train;

public class Booked {
     String source;
     String destination;
     int tickets;
    int id;
    

    Booked(int id,String source,String destination,int tickets) {
         this.source=source;
        this.destination=destination;
        this.tickets=tickets;
        this.id=id;
    }
   
    Booked()
    {
        
    }
}
