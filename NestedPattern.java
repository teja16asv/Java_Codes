class NestedPattern{
	
	public static void main(String[] args){
	int i,j;
	int n=5;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i+j==n-1)||(i==j))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}

 
