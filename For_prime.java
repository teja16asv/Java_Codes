// Write a program to print the prime numbers between 1 and 10 using for,while and do while loops?
import java.util.*;
class For_prime{
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
	int n=sc.nextInt();
	int i,count=0;
	for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not Prime Number");
}
}
}	