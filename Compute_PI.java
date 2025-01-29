import java.util.*;
class Compute_PI
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=1;
double sum=0.00;
for(double i=1;i<(2*n);i=i+2)
{
sum=(double)sum+((1/i)*t);
t=t*(-1);
}
double pi=sum*4;
System.out.println(pi);
}
}