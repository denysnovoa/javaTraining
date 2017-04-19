package gestion;

public class Client extends Person {

  private String CIF, company, emailCompany;

  public String getCIF() {
    return CIF;
  }

  public void setCIF(String CIF) {
    this.CIF = CIF;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getEmailCompany() {
    return emailCompany;
  }

  public void setEmailCompany(String emailCompany) {
    this.emailCompany = emailCompany;
  }

  public Client() {
  }

  public Client(String CIF, String company, String emailCompany) {
    this.CIF = CIF;
    this.company = company;
    this.emailCompany = emailCompany;
  }

  public Client(String name, String surName, String address, String CIF, String company, String emailCompany) {
    super(name, surName, address);
    this.CIF = CIF;
    this.company = company;
    this.emailCompany = emailCompany;
  }
}
