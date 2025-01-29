import java.util.*;
class Example0{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	char g = sc.next().charAt(0);
	String res = (g=='m')?"male":"female";
	System.out.println(res);
}
}