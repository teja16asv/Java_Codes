class Array_Dowhile{

	public static void main(String[] args){
		
		int i=0,Sum=0;
		int[] marks ={10,20,44,89,25};
do{
Sum=Sum+marks[i];
i++;
}
while(i<5);
System.out.println("Sum is"+ Sum);
}
}
