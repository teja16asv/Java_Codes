class Do_whileFactorial{

	public static void main(String[] args){

	int i=1,n=5,fact=1;
	
do{
fact=fact*i;
i++;
}
while(i<=5);
System.out.println("factorial is"+fact);
}
}