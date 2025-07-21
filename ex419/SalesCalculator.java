
import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prices corresponding to item numbers 1 to 4
        double[] prices = {0.0, 239.99, 129.75, 99.95, 350.89};

        double totalSales = 0.0;

        System.out.println("Enter items sold by the salesperson (enter 0 to finish):");

        while (true) {
            System.out.print("Item number (1-4, 0 to finish): ");
            int itemNumber = input.nextInt();

            if (itemNumber == 0) {
                break;  // exit input loop
            }

            if (itemNumber < 1 || itemNumber > 4) {
                System.out.println("Invalid item number. Please enter 1 to 4.");
                continue;
            }

            totalSales += prices[itemNumber];
        }

        double earnings = 200 + 0.09 * totalSales;

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Earnings: $%.2f%n", earnings);
    
    input.close();

    }
}
