import java.util.*;
class HasEight
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int rem;
boolean k=false;
for(int i=0;i<a;i++)
{
rem=a%(int)Math.pow(10,i);
if(rem==8)
{
k=true;
}
}
if(k)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}