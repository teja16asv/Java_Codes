import java.util.*;
class SalesTax1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double SalesTaxRate=0.07;
int Sentinel= -1;
double Price,actualPrice,salesTax;
double totalPrice=0.0;
double totalActualPrice=0.0;
double totalsalesTax=0.0;
Price=sc.nextDouble();
while(Price!=Sentinel)
{
actualPrice=price/(1+(SalesTaxRate));
salesTax=price-actualPrice;
totalPrice += Price;
totalActualPrice += actualPrice;
totalSalestax += (int)salesTax;

System.out.println("actualPrice is: "+("%.2f",actualPrice));
System.out.println("Salestax is : "+("%.2f",salesTax));
price=sc.nextDouble();
}
System.out.println(totalSalestax);
}
}