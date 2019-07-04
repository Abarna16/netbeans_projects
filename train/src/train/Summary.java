
package train;

public class Summary {
     String source;
     String destination;
     int start;
     int end;
    int id;
    int dummy;
    Summary(int dummy,int id,int start,int end,String source,String destination)
    {
        this.dummy=dummy;
        this.id=id;
        this.start=start;
        this.end=end;
        this.source=source;
        this.destination=destination;
    }
    Summary()
    {
        
    }
    public int getDummy()
    {
        return dummy;
    }
    public int getId()
    {
        return id;
    }
    public int getStart()
    {
        return start;
    }
    public int getEnd()
    {
        return end;
    }
    public String getSource()
    {
        return source;
    }
    public String getDestination()
    {
        return destination;
    }
   
}
