import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 3 integers from the user
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Calculations
        int sum = num1 + num2 + num3;
        int average = sum / 3; // Integer division
        int product = num1 * num2 * num3;

        // Find smallest
        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        // Find largest
        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    }
}
