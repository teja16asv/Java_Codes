class First
{
public static int add(int a,int b)
{
return a+b;
}
}
class Second extends First
{
public static int add(int a,int b)
{
return a+b;
}
}
class MethodOverRiding
{
public static void main(String[] args)
{
Second sobj=new Second();
System.out.println("Add is "+sobj.add(1,2));
System.out.println("Add is "+sobj.add(100,200));
}
}