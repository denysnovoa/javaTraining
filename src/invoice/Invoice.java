package invoice;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {
  private long id;
  private LocalDate date;
  private double amount;
  private Customer customer;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  Invoice(long id, LocalDate date, double amount, Customer customer) {
    this.id = id;
    this.date = date;
    this.amount = amount;
    this.customer = customer;
  }
}
