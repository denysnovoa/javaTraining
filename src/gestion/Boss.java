package gestion;

public class Boss extends Employee {
  double commissions;

  final int km = 20;
  final int priceKm = 10;
  final int dayFree = 5;
  final int priceDayFree = 15;

  public double getCommissions() {
    return commissions;
  }

  public void setCommissions(double commissions) {
    this.commissions = commissions;
  }

  public double getKm() {
    return km;
  }

  public int getDayFree() {
    return dayFree;
  }

  public Boss(String name, String surName, String address, String department, String code, double subsistenceAllowance, double salary, double commissions) {
    super(name, surName, address, department, code, subsistenceAllowance, salary);
    this.commissions = commissions;
  }

  @Override
  public double getSubsistenceAllowance() {
    return baseSalary + commissions + (km * priceKm) + (dayFree + priceDayFree);
  }
}
