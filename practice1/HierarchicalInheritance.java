package practice1;
public class HierarchicalInheritance {
    public static void main(String args[])
{
Bike bike=new Bike("TN74 12345",2,37);
bike.display1();
Bus bus=new Bus("TN74 12345",4,"ravi");
bus.display1();

}
   
}
class Vehicle
{
 String registerNumber;
    int numberOfWheels; 
    Vehicle(String regno,int noWheel)
    {
        this.registerNumber=regno;
        this.numberOfWheels=noWheel;
    }
    void display()
    {
        System.out.println("Register number: "+registerNumber);
        System.out.println("Number of wheels: "+numberOfWheels);
    }
}
class Bike extends Vehicle
{
    int mileage;
    Bike(String regNumber,int noOfWheels,int mileage)
    {
        super(regNumber,noOfWheels);
        this.mileage=mileage;
    }
    void display1()
    {
         System.out.println("Bike:");
         super.display();
         
    }
}
class Bus extends Vehicle
{
String conductorName;
Bus(String  regNumber,int noOfWheels,String conductorName)
{
    super( regNumber,noOfWheels);
    this.conductorName=conductorName;
}
void display1()
{
    System.out.println("Bus");
    super.display();
    System.out.println(conductorName);
}
}

