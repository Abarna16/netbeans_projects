
package practice1;
import java.io.BufferedWriter; 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
public class File1 {
    

	public static void main(String[] args) throws IOException 
	{ 
            int i;
		
		
		BufferedWriter ob=new BufferedWriter(new FileWriter("D:\\file.txt",true));
                ob.write("hi");
                ob.close();
                
		FileReader fr = new FileReader("D:\\file.txt"); 
               
		BufferedReader br = new BufferedReader(fr); 
                
		while((i=br.read())!=-1)
                {
                    System.out.print((char)i);
                }
		br.close();
                fr.close();
	
		
        }
} 



