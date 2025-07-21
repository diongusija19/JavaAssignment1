 
 public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date myDate = new Date(7, 18, 2025);

        // Display the date
        System.out.print("The date is: ");
        myDate.displayDate();

        // Change the date
        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2025);

        // Display updated date
        System.out.print("Updated date: ");
        myDate.displayDate();
    }
}
