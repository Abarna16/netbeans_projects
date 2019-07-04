
package practice1;

class StringBuffer1 { 
    public static void stringEx()
       {
           int i;
          String value="hi";
          for(i=0;i<2000;i++)
              value=value+" hello";
         // System.out.println(value);
       }
   public static void stringBuffer()
       {
           int i;
          StringBuffer object=new StringBuffer("hi");
          for(i=0;i<2000;i++)
              object=object.append(" hello");
         // System.out.println(object);
       }
    
    
   public static void main(String args[])
   {
       long startTime=System.currentTimeMillis();
    stringBuffer();
       System.out.println((System.currentTimeMillis()-startTime)+"ms");
       startTime=System.currentTimeMillis();
       
       stringEx();
       System.out.println((System.currentTimeMillis()-startTime)+"ms");
        
         
       
    
      
   }
}
