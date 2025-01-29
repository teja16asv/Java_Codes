interface Vehicle
{
void engineStart();
void speed();
void changeGear();
}
class Car implements Vehicle
{
public void engineStart()
{
System.out.println("Engine starts");
}
public void speed()
{
System.out.println("Speed is 80km");
}
public void changeGear()
{
System.out.println("Changing gear4 to gear5");
}
}
class InterfaceExampleProg
{
public static void main(String[] args)
{
Car c1=new Car();
c1.engineStart();
c1.speed();
c1.changeGear();
}
}