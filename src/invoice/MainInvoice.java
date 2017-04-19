package invoice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MainInvoice {

  private static final String INVOICE_PATH = "invoice.xml";

  public static void main(String[] args) {
    Invoice invoicePepe = new Invoice(1, LocalDate.now(), 2000, new Customer("pepe", "lópez", "Avenida 1"));
    Invoice invoiceJuan = new Invoice(2, LocalDate.now(), 22200, new Customer("Juan", "rodriguez", "Avenida 2"));

    InvoiceManager invoiceManager = new InvoiceManager(new ArrayList<>(Arrays.asList(invoicePepe, invoiceJuan)));

    saveInvoiceState(invoiceManager);

    invoiceManager.clear();

    System.out.print("Invoices " + invoiceManager.getInvoices().toString());
    System.out.println();
    System.out.print("Invoices count " + invoiceManager.getInvoices().size());
    System.out.println();

    loadInvoiceLastState(invoiceManager);

    System.out.println("Invoices " + invoiceManager.getInvoices().toString());
    System.out.println("Invoices count " + invoiceManager.getInvoices().size());
  }

  private static void loadInvoiceLastState(InvoiceManager invoiceManager) {
    try {
      FileInputStream fileInputStream = new FileInputStream(INVOICE_PATH);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

      Invoice invoice;

      while ((invoice = (Invoice) objectInputStream.readObject()) != null) {
        invoiceManager.getInvoices().add(invoice);
      }

      fileInputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static void saveInvoiceState(InvoiceManager invoiceManager) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(INVOICE_PATH);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

      for (Invoice invoice : invoiceManager.getInvoices()) {
        objectOutputStream.writeObject(invoice);
        objectOutputStream.flush();
      }

      objectOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
