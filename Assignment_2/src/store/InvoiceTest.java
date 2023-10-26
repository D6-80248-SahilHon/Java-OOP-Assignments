package store;
import store.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i=new Invoice();
		i.accept();
		i.calculateInvoice();
		i.display();

	}

}
