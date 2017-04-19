package gestion;

public class GeneralManager extends Boss {

  double especialSubsistenceAllowance;

  public double getEspecialSubsistenceAllowance() {
    return especialSubsistenceAllowance;
  }

  public void setEspecialSubsistenceAllowance(double especialSubsistenceAllowance) {
    this.especialSubsistenceAllowance = especialSubsistenceAllowance;
  }

  public GeneralManager(String name, String surName, String address, String department, String code, double subsistenceAllowance
      , double salary, double commissions, double especialSubsistenceAllowance) {

    super(name, surName, address, department, code, subsistenceAllowance, salary, commissions);
    this.especialSubsistenceAllowance = especialSubsistenceAllowance;
  }

}
