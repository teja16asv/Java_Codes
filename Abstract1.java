abstract class Sport_bike
{
abstract void engine();
}
class Light_weight extends Sport_bike
{
public void engine()
{
System.out.println("Bike cc is about 500");
}
}
class Middle_weight extends Sport_bike
{
public void engine()
{
System.out.println("Bike cc is about 600-900");
}
}
class Super_bike extends Sport_bike
{
public void engine()
{
System.out.println("Bike cc is about 1000");
}
}
class Abstract1
{
public static void main(String[] args)
{
Light_weight bike1= new Light_weight();
bike1.engine();
Middle_weight bike2=new Middle_weight();
bike2.engine();
}
}