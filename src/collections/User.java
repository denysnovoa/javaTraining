package collections;

import java.time.LocalDate;
import java.time.Period;

public class User {
  String name;
  LocalDate birthDate;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public int getAge() {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public User(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }
}
