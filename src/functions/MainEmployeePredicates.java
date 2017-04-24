package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static functions.EmployeePredicates.filterEmployees;
import static functions.EmployeePredicates.isAdultFemale;
import static functions.EmployeePredicates.isAdultMale;
import static functions.EmployeePredicates.isAgeMoreThan;

public class MainEmployeePredicates {

  public static void main(String[] args) {

    Employee employee1 = new Employee(1, 22, "M", "employee1", "las1");
    Employee employee2 = new Employee(2, 47, "F", "employee2", "las2");
    Employee employee3 = new Employee(3, 35, "M", "employee3", "las3");
    Employee employee4 = new Employee(4, 28, "F", "employee4", "las4");
    Employee employee5 = new Employee(5, 21, "F", "employee5", "las5");
    Employee employee6 = new Employee(6, 25, "M", "employee6", "las6");

    List<Employee> employees = new ArrayList<>();
    employees.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6));

    System.out.printf("MALES ADULTS %s", filterEmployees(employees, isAdultMale()));
    System.out.println();

    System.out.printf("FEMALES ADULTS %s", filterEmployees(employees, isAdultFemale()));
    System.out.println();

    System.out.printf("OVER THAN 25 %s", filterEmployees(employees, isAgeMoreThan(25)));
    System.out.println();

    System.out.printf("UNDER ADULTS 25%s", filterEmployees(employees, isAgeMoreThan(25).negate()));
    System.out.println();

  }
}
