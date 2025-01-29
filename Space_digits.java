import  java.util.*;
class Space_digits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i,rev=0,b;
while(a!=0)
{
i=a%10;
rev=rev*10+i;
a=a/10;
}
while(rev!=0)
{
b=rev%10;
System.out.print(b+" ");
rev=rev/10;
}
}
}