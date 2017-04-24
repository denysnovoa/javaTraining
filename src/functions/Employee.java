package functions;

public class Employee {
  Integer age, id;
  String gender;
  String firstName;
  String lastName;


  public Integer getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public Employee(Integer id, Integer age, String gender, String firstName, String lastName) {
    this.id = id;
    this.age = age;
    this.gender = gender;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s", id.toString(), age.toString(), gender);
  }
}
