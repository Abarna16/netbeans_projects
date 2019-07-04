package Cab;

import java.util.ArrayList;

public class CabLocation {
    String location;
    int total;
    int commision;
    ArrayList<Detail> detail=new ArrayList<Detail>();
    
  
    int cabId;
    int flag;
    int trips;
    CabLocation(){}
    CabLocation(String location,int cabId)
    {
        this.location=location;
        this.cabId=cabId;
        
        
    }
    public void AddDetail(int id,Detail detail1,ArrayList<CabLocation> location)
            
    {
        for(CabLocation i:location)
        {
            if(i.cabId==id)
            {
                i.detail.add(detail1);
            }
        }
    }
   
    public String getLocation()
    {
        return this.location;
    }
    public int getCabId()
    {
        return this.cabId;
    }
    public String toString()
    {
        StringBuffer s=new StringBuffer();
         for(Detail x:detail)
                          {
                              s.append(x);
                          }
        return s+"\n"+this.total +"Number of trips "+this.trips ;
    }
}
