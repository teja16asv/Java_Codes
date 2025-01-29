class StringExampleProgram{
	
	public static void main(String[] args){

		String name= "Vijay";
		String name1= "teja";
		System.out.println("Length is " + name.length());
		System.out.println("Uppercase is " + name.toUpperCase());
		System.out.println("Lower case is "+ name.toLowerCase());
		System.out.println("Char at pos " + name.charAt(2));
		System.out.println("Index is " +name.indexOf('a'));
		System.out.println("Concate is "+ name.concat(name1));
		}
}
