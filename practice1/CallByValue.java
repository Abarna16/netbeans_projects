
package practice1;


public class CallByValue
{ 
 int data=50;  
  
 void change(CallByValue ob){  
 ob.data=ob.data+100;
 }  
     
 public static void main(String args[])
 {  
   CallByValue ob=new CallByValue();  
  
   System.out.println("before change "+ob.data);  
   ob.change(ob);  
   System.out.println("after change "+ob.data);  
  
 }  
}  

