package invoice;

import java.util.List;

class InvoiceManager {

  List<Invoice> invoices;

  List<Invoice> getInvoices() {
    return invoices;
  }

  void setInvoices(List<Invoice> invoices) {
    this.invoices = invoices;
  }

  InvoiceManager(List<Invoice> invoices) {
    this.invoices = invoices;
  }

  void clear() {
    invoices.clear();
  }

}
