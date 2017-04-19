package gestion;

public class Employee extends Person {

  String department, code;
  Double subsistenceAllowance, baseSalary;

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getDepartment() {
    return department;
  }


  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setSubsistenceAllowance(double subsistenceAllowance) {
    this.subsistenceAllowance = subsistenceAllowance;
  }

  public double getSubsistenceAllowance() throws ExceptionEmployee {
    if (baseSalary + subsistenceAllowance < 2300)
      throw new ExceptionEmployee("Employee subsistenceAllowance < 2300");

    return baseSalary + subsistenceAllowance;
  }

  public Employee(String name, String surName, String address, String department, String code,
                  double subsistenceAllowance, Double salary) {
    super(name, surName, address);

    this.department = department;
    this.code = code;
    this.subsistenceAllowance = subsistenceAllowance;
    this.baseSalary = salary;
  }
}
