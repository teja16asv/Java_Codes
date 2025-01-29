// write a program to find numbers between 1 and 30 whicch are divisible by 2 and 4.
class While_loop{
	
	public static void main(String[] args){
int i =1,Sum=0;
while(i<=30)
{
if((i%2==0)&&(i%4==0))
{
System.out.println(i);
}
i++;
}
}
}