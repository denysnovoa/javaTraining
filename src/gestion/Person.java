package gestion;

import java.io.Serializable;

public class Person implements Serializable {
  private String name, surName, address;

  public Person() {
  }

  public Person(String name, String surName, String address) {
    this.name = name;
    this.surName = surName;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return String.format("%s, %s. Email: %s", name, surName, address);
  }
}
