import java.util.*;
class Switch1{

	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int a = sc.nextInt();
	System.out.println("Enter the number");
	int b = sc.nextInt();
	System.out.println("Enter the choice");
	int choice = sc.nextInt();

switch(choice)
{
case 1:
System.out.println("Add is"+(a+b));
break;
case 2:
System.out.println("Sub is"+(a-b));
break;
case 3:
System.out.println("Mul is"+(a*b));
break;
case 4:
System.out.println("Div is"+(a/b));
break;
default:
System.out.println("Incorrect choice");
}
}
}
