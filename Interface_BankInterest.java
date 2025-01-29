interface Bank
{
float ROI();
float loan();
}
class SBI implements Bank
{
public float ROI()
{
int amount=50000;
return (float)(8.5*amount)/100;
}
public float loan()
{
int amount=35000;
return (float)(
}
class Axis implements Bank
{
public float ROI()
public
{
int amount=50000;
return (float)(10.1*amount)/100;
}
}
class HDFC implements Bank
{
public float ROI()
{
int amount=50000;
return (float)(9.6*amount)/100;
}
}
class Interface_BankInterest
{
public static void main(String[] args)
{
SBI b1=new SBI();
Axis b2=new Axis();
HDFC b3= new HDFC();
System.out.println("Sbi ROI is "+ b1.);
