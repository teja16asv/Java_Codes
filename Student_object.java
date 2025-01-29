class Student_object
{
String name;
int age;
int rollno;
String branch;
char gender;
Student_object(String name,int age,int rollno,String branch,char gender)
{
this.name=name;
this.age=age;
this.rollno=rollno;
this.branch=branch;
this.gender=gender;
}
public void display()
{
System.out.println("Name is "+this.name);
System.out.println("age is "+this.age);
System.out.println("rollno is "+this.rollno);
System.out.println("branch is "+this.branch);
System.out.println("gender is "+this.gender);
}
public static void main(String[] args){
Student_object s1=new Student_object("Teja",17,10,"csm",'M');
s1.display();
}
}