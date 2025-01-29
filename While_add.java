class While_add{

	public static void main(String[] args){
	int i =1,Sum =0;
	while(i<=30)
{
if((i%2==0)&&(i%4==0))
{
System.out.println(i);
Sum+=i;
}
i++;
}
System.out.println("Sum =" + Sum);
}
}

