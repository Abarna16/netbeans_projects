
package practice1;

public class Static {
   
    static int p=10;
    int p1=0;
   
	public static void main(String[] args)
	{
		int x;
		
		{
			int y = 100;//local variable
			x = 200;
			//System.out.println("x = "+x);
		}
		 //System.out.println(y);
		System.out.println("x = "+x);
		Static ob1=new Static();
                Static ob2=new Static();
                ob1.p=ob1.p+10;
                System.out.println(ob1.p);
                System.out.println(ob2.p);
                 System.out.println(p);//static variable
                 System.out.println(ob1.p1);//instance variable
                
	}
        
        
}


