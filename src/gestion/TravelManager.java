package gestion;

public class TravelManager extends Boss {

  double carCompany, objectives;

  public double getCarCompany() {
    return carCompany;
  }

  public void setCarCompany(double carCompany) {
    this.carCompany = carCompany;
  }

  public double getObjectives() {
    return objectives;
  }

  public void setObjectives(double objectives) {
    this.objectives = objectives;
  }

  public TravelManager(String name, String surName, String address, String department, String code, double subsistenceAllowance
      , double salary, double commissions, double carCompany, double objectives) {
    super(name, surName, address, department, code, subsistenceAllowance, salary, commissions);
    this.carCompany = carCompany;
    this.objectives = objectives;
  }
}
