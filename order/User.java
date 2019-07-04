package order;

public class User {
String name;
String password;
 
User(String name,String password)
{
    this.name=name;
    this.password=password;
}
User(){
    
}
   //  int id=1;
 @Override
 public String toString()
 {
    return this.name+" "+this.password+"\n";
 }
}