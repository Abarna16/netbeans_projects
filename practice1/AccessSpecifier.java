package practice1;
//same class and same pakage
public class AccessSpecifier {
    private int a=10;
             protected int b=20;
             public int c=30;
            int d=40;
    public static void main(String args[])
    {
            
     AccessSpecifier object=new AccessSpecifier();
        System.out.println("private variable"+object.a);
         System.out.println("protected variable"+object.b);
          System.out.println("public variable"+object.c);
           System.out.println("default variable"+object.d); 
    }
}
