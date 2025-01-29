class Parent1
{
public
int a=10;
int b=20;
}
public class Child extends Parent1
{
public
int x=100;
int y=200;
void add(int i,int j)
{
System.out.println(i+j);
System.out.println(x+y);
System.out.println(a+b);
}
public static void main(String[] args)
{
new Child().add(1000,2000);
}
}