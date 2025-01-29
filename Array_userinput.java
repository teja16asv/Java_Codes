import java.util.*;
class Array_userinput{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int size= sc.nextInt();
	int[] arr= new int[size];
int i;
System.out.println("enter the array elements");	
for(i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Created array is");
for(i=0;i<size;i++)
{  
System.out.print(arr[i]+" ");
}
}
}