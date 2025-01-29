class Addition_AllFourMethods{
//with arg with ret
	public static int add1(int a,int b){
return a+b;
}
//with arg without ret
	public static void add(int a,int b){
System.out.println(a+b);
}
//without arg with ret
	public static int add(){
int a=2,b=5;
return a+b;
}
//without arg without ret
	public static void hello(){
System.out.println("How are you");
}
	public static void main(String[] args){

System.out.println(add1(2,5));
add(2,52);
System.out.println(add());
hello();
}
}