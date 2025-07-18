import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for two integers
        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        // Check if the first is a multiple of the second
        if (second != 0) { // avoid dividing by zero
            if (first % second == 0) {
                System.out.println(first + " is a multiple of " + second);
            } else {
                System.out.println(first + " is NOT a multiple of " + second);
            }
        } else {
            System.out.println("Cannot divide by zero.");
        }
        input.close();
    }
}
