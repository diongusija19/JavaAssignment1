import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeCount = 3;

        for (int i = 1; i <= employeeCount; i++) {
            System.out.println("Employee #" + i);

            System.out.print("Enter hours worked: ");
            double hoursWorked = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;
                grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            }

            System.out.printf("Gross pay for employee #%d is: $%.2f%n%n", i, grossPay);
        }

        input.close();
    }
}
