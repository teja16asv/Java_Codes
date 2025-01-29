class Array_count{

	public static void main(String[] args){

	int A[] ={16,5,1,3,4,8,24,17,19};
	int i,ecount=0,ocount=0;
	for(i=0;i<9;i++)
{
if(A[i]%2==0)
{
ecount+=1;
}
else
{
ocount+=1;
}
}
System.out.println("Even count is "+ecount);
System.out.println("Odd count is "+ocount);
}
}