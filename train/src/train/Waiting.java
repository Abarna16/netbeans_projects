/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author Administrator
 */
public class Waiting {
     String source;
     String destination;
     int tickets;
    int id;
    

    Waiting(int id,String source,String destination,int tickets) {
         this.source=source;
        this.destination=destination;
        this.tickets=tickets;
        this.id=id;
    }
   
}
