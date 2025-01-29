abstract class Animal
{
abstract void eat();
}
class Herbivores extends Animal
{
public void eat()
{
System.out.println("I am a Vegetarian");
}
}
class Carnivores extends Animal
{
public void eat()
{
System.out.println("I am a Non Vegetarian");
}
}
class Omnivores extends Animal
{
public void eat()
{
System.out.println("I will eat both Veg and Non Veg");
}
}
class Abstract2
{
public static void main(String[] args)
{
Herbivores h1=new Herbivores();
h1.eat();
Carnivores h2= new Carnivores();
h2.eat();
Omnivores h3=new Omnivores();
h3.eat();
}
}