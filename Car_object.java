class Car_object
{
static String brand="Suzuki";
String model;
String colour;
int cc;
String version;
;
Car_object(String model,String colour,int cc,String version)
{
this.model=model;
this.colour=colour;
this.cc=cc;
this.version=version;
}
public void display()
{
System.out.println("Brand - "+Car_object.brand);
System.out.println("model "+this.model);
System.out.println("colour - "+this.colour);
System.out.println("engine cc - "+this.cc);
System.out.println("version - "+this.version);
System.out.println();
}
public static void main(String[] args)
{
Car_object c1= new Car_object("S-cross","blue",1200,"alpha");
Car_object c2= new Car_object("baleno","grey",1500,"zeta");

c1.display();
c2.display();
}
}