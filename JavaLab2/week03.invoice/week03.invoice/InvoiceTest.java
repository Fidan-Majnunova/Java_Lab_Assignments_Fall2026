import week03.invoice;
import week03.invoice.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice_1 = new Invoice("A", "laptop", 3, 957.60);
        Invoice invoice_2 = new Invoice("B", "Phone", 2, 463.567);
        Invoice invoice_3 = new Invoice("C", "Headphone",5 , 56.78);

        System.out.println(invoice_1.getInvoiceAmount());
        System.out.println(invoice_2.getInvoiceAmount());
        System.out.println(invoice_3.getInvoiceAmount());
    }
    
}
