import java.util.Scanner;

public class MainEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for two integers
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        // Compare the numbers
        if (number1 > number2) {
            System.out.println(number1 + " is larger.");
        } else if (number2 > number1) {
            System.out.println(number2 + " is larger.");
        } else {
            System.out.println("These numbers are equal.");
        }
        input.close();
    }
}