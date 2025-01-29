import java.util.*;
class Scanner_float{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number -");
		float a = sc.nextFloat();
		System.out.println("Enter your second number-");
		float b = sc.nextFloat();
		System.out.println("Enter your third number-");
		float c = sc.nextFloat();
		System.out.println("Enter your fourth number-");
		float d = sc.nextFloat();
		float e = a + b + c + d;
		System.out.println(e);
}
} 