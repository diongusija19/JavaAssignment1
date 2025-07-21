import java.util.Scanner;

public class CreditChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (-1 to quit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                System.out.println("Exiting program.");
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits this month: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.println("Account Number: " + accountNumber);
            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println();
        }
        input.close();

    }
}
