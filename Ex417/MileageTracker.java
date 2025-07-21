
import java.util.Scanner;

public class MileageTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            if (gallons <= 0) {
                System.out.println("Gallons must be greater than 0. Try again.");
                continue;
            }

            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f MPG%n", tripMPG);

            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons > 0) {
                double combinedMPG = (double) totalMiles / totalGallons;
                System.out.printf("Combined average MPG so far: %.2f MPG%n", combinedMPG);
            }

            System.out.println();
        }

        if (totalGallons > 0) {
            double finalMPG = (double) totalMiles / totalGallons;
            System.out.printf("%nFinal combined average MPG: %.2f MPG%n", finalMPG);
        } else {
            System.out.println("No trip data entered.");
        }

        input.close();
    }
}
