class While_count{

	public static void main(String[] args){
	int i=1,count=0;
	while(i<=50)
{
if((i%3==0)||(i%7==0))
{
System.out.println(i);
count+=1;
}
i++;
}
System.out.println(count);
}
}