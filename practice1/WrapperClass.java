package practice1;
public class WrapperClass {
    public static void main(String args[])
    {
     float f1=12444.4f;
     Float f2=Float.valueOf(f1);
    
        System.out.println("double value :"+f2.doubleValue()); 
      System.out.println("int value :"+f2.intValue());
        System.out.println("Byte value :"+f2.byteValue()); 
        System.out.println("long value :"+f2.longValue()); 
        System.out.println("Short value :"+f2.shortValue());
        System.out.println("String value :"+f2.toString()); 
    }

   
}