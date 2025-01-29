import java.util.*;
class Factorial1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i,fact=1;
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}