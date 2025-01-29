class PolymorphismProg_OverLoading
{
public static int add(int a,int b)
{
return a+b;
}
public static int add(int a, int b, int c)
{
return a+b;
}
public static int add(int a,int b,int c,int d,int e)
{
return a+b+c+d+e;
}
public static void main(String[] args)
{
System.out.println("Add is : "+ add(1,2,3,4,5));
System.out.println("Add is : "+add(100,300,500));

}
}