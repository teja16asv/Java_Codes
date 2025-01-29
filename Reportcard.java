// write a program to prepare a report card of a student?
import java.util.*;
class Reportcard{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
		int a =sc.nextInt();
		
if((a>90)&&(a<=100)){
System.out.println("O");
}
else if((a>80)&&(a<=90)){
System.out.println("A");
}
else if((a>70)&&(a<=80)){
System.out.println("B");
}
else if((a>60)&&(a<=70)){
System.out.println("C");
}
else if((a>50)&&(a<=60)){
System.out.println("D");
}
else if((a>40)&&(a<=50)){
System.out.println("E");
}
else{
System.out.println("Fail");
}
}
}
