
public class InvoiceTest {
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("1234", "Hammer", 5, 9.99);

        // Display invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: $" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
