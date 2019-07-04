
package train;

import java.util.ArrayList;
import java.util.Scanner;


public class Train {

   
    public static void main(String[] args) {
        
          ArrayList<Station> station=new ArrayList<Station>();
          
        station.add(new Station("A",0,0));
       station.add(new Station("B",0,0));
        station.add(new Station("C",0,0));
         station.add(new Station("D",0,0));
          station.add(new Station("E",0,0));
          ArrayList<Booked> booked=new ArrayList<Booked>();
          ArrayList<Waiting> waiting1=new ArrayList<Waiting>();
          ArrayList<Summary> summary=new ArrayList<Summary>();
       int ch;
       int pnr=1,available;
        do
            {
            System.out.println("Menu");
            System.out.println("1.Book\n2.cancel\n3.summary\n4.chart");
            
             System.out.println("Enter your choice\n");
         Scanner s=new Scanner(System.in);
            ch=s.nextInt();
            
            switch(ch)
            {
                case 1:
                {
                   String source,destination;
                   s.nextLine();
                   int flag=0,waitingflag=0;
                    System.out.println("Enter source\n");
                    source=s.nextLine();
                    System.out.println("Enter destination\n");
                      destination = s.nextLine();
                    System.out.println("Enter number of seats\n");
                    int seats = s.nextInt();
                    for(Station i:station)
                    {
                        if((i.sta).equals(source))
                        {
                            if(i.booked==8)
                            {
                                if(i.waiting<=2 && seats<=(2-(i.waiting)))
                                {
                                    waiting1.add(new Waiting(pnr,source,destination,seats));
                                    int before=i.waiting;
                                    i.waiting+=seats;
                                    summary.add(new Summary(0,pnr,before+1,i.waiting,source,destination));
                                    waitingflag=1;
                                }
                                else
                                   flag=1;
                                    
                            }
                            else if((i.booked<8))
                            {
                                available=8-(i.booked);
                                if(available>=seats)
                                {
                                    booked.add(new Booked(pnr,source,destination,seats));
                                   int before1=i.booked;
                                    i.booked+=seats;
                                     summary.add(new Summary(1,pnr,before1+1,i.booked,source,destination));
                                }
                                else
                                   flag=1;
                            }
                            else
                                flag=1;
                        }
                    }
                    if(flag==1)
                         System.out.println("No seats available\n");
                    else if(waitingflag==1)
                    {
                        System.out.println("Waiting list...your booking id is "+pnr);
                    pnr++;
                    }
                        else
                    {
                         System.out.println("successfully booked..your booking id is "+pnr);
                      pnr++;
                    }
                    
                break;
                }
                case 2:
                    int id,seat,x;
                     System.out.println("Enter your Booking id\n");
                    id = s.nextInt();
                     System.out.println("Enter number of seats to cancel\n");
                    seat = s.nextInt();
                    if(!waiting1.isEmpty())
                    {
                     for(Waiting i:waiting1)
                    {
                        if(id==i.id)
                        {
                            
                             for(Station k:station)
                            {
                                if((i.source).equals(k.sta))
                                {
                                   k.waiting-=seat;
                                }
                            }
                            
                            if(i.tickets+1==seat)
                            {
                               
                                waiting1.remove(i);
                                
                            }
                            else
                            {
                                i.tickets-=seat;
                                
                            }
                            
                           
                        }
                    }
                    }
                    for(Booked i:booked)
                    {
                        if(id==i.id)
                        {
                           i.tickets-=seat;
                            System.out.println("your total tickets "+i.tickets);
                            for(Station k:station)
                            {
                                if((i.source).equals(k.sta))
                                {
                                    k.booked-=seat;
                                     summary.add(new Summary(2,pnr,seat+1,(k.booked+seat),i.source,i.destination));
                                    x=8-k.booked;
                                    System.out.println(" total tickets booked"+k.booked+"total waiting list"+k.waiting);
                                    if(x<=k.waiting)
                                    {
                                        k.waiting-=x;
                                        k.booked+=x;
                                    }
                                    else
                                    {
                                       
                                        System.out.println("Not vailable");
                                        k.booked=k.booked+k.waiting;
                                         k.waiting=0;
                                          System.out.println("total tickets booked"+k.booked+"total waiting list"+k.waiting);
                                    }
                                }
                            }
                        }
                    }
                    
                     break;
                     
                case 3:
                    for(Summary i:summary)
                    {
                        System.out.print("PNR "+i.getId()+", "+i.getSource()+" to "+i.getDestination()+", Seat Nos:");
                        int start=i.getStart();
                        int end=i.getEnd();
                        if(i.getDummy()==1)
                        {
                        for(int k=start;k<=end;k++)
                        {
                            System.out.print(k+" ");
                        }
                        }
                        else if(i.getDummy()==0)
                        {
                            for(int k=start;k<=end;k++)
                        {
                            System.out.print("WL"+k+",");
                        } 
                        }
                        else 
                        {
                             for(int k=start;k<=end;k++)
                        {
                            System.out.print(k+" ");
                        }
                            
                        }
                        System.out.println();
                    }
                    
                    
            }
       
           
                
            }while(ch<4);
        
    }
    
}
