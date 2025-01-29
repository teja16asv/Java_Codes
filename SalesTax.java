import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;
        double totalActualPrice = 0.0;
        double totalSalesTax = 0.0;
        while (true) {
            double taxInclusivePrice = scanner.nextDouble();
            if (taxInclusivePrice == -1.0) {
                break;
            }
            double actualPrice = taxInclusivePrice * (100.0 / 107.0);
            double salesTax = taxInclusivePrice - actualPrice;
            actualPrice = Math.round(actualPrice * 100.0) / 100.0;
            String salesTaxString = String.format("%.2f", salesTax);
            if (salesTaxString.length() < 4) {
                salesTaxString += "0";
            }
            double roundedSalesTax = Double.parseDouble(salesTaxString);
            System.out.println("Sales tax: $" + salesTaxString);
            totalPrice += taxInclusivePrice;
            totalActualPrice += actualPrice;
            totalSalesTax += roundedSalesTax;
        }
    }
}