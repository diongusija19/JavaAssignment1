public class EmployeeTest {
    public static void main(String[] args) {
        // Create two employees
        Employee emp1 = new Employee("Alice", "Johnson", 3000.00);
        Employee emp2 = new Employee("Bob", "Smith", 2500.00);

        // Display initial yearly salaries
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " yearly salary: $" + emp2.getYearlySalary());

        // Give a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display updated yearly salaries
        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " yearly salary: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " yearly salary: $" + emp2.getYearlySalary());
    }
}
