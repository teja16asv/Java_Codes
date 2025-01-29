import java.util.*;
class SumAtoB
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int i,Sum=0;
float c=a+b;
float d=c/2;
for(i=a;b>=i;i++)
{
Sum=Sum+i;
}
System.out.println("The sum of "+a+" to "+b+" is "+Sum);
System.out.println("The average is "+d);

}
}