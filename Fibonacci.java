import java.util.*;
class Fibonacci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,n1=0,n2=1,n3;
System.out.print(n1+" ");
System.out.print(n2+" ");
while(n>=2)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
n-=1;
}
}
}