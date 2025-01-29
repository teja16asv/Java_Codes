//without return with arguments
class Addition_WithoutRetWithArg{

	public static void add(int a,int b){
//if the local variables are used in the block ,they will be considered as the actual values.
//suppose now i f we give the values a=100,b=200 here the output will be 300.
System.out.println(a+b);
}
public static void main(String[] args){
//if we give the values  a=100,b=200 here the output will be 51, because they are considererd as instance variables 
add(25,26);
}
}
