package gestion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainEmployee {

  public static void main(String[] args) {

    Employee[] employees = new Employee[8];
    employees[0] = new Employee("nombre1", "apellido1", "dirección1", "departament1", "code1", 1000, (double) 1500);
    employees[1] = new Employee("nombre2", "apellido2", "dirección1", "departament1", "code1", 1000, (double) 1000);
    employees[2] = new Employee("nombre3", "apellido3", "dirección1", "departament1", "code1", 1000, (double) 1500);
    employees[3] = new Employee("nombre4", "apellido4", "dirección1", "departament1", "code1", 1000, (double) 1500);
    employees[4] = new Boss("nombreJefe1", "apellidoJefe1", "dirección1", "departament1", "code1", 1000, 1500, 2000);
    employees[5] = new Boss("nombreJefe2", "apellidoJefe2", "dirección1", "departament1", "code1", 1000, 1500, 2001);
    employees[6] = new TravelManager("nombreTravelManager2", "apellidoTravelManager2", "dirección1", "departament1", "code1", 1000, 1500,
        2001, 200, 200);
    employees[7] = new GeneralManager("nombreTravelManager2", "apellidoTravelManager2", "dirección1", "departament1", "code1", 1000, 1500,
        2001, 200);

    for (Employee employee : employees) {
      try {
        FileWriter fileWriter = new FileWriter("employeSalary.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.printf("Employee subsistence allowance %s ", employee.getSubsistenceAllowance());
        printWriter.println();
        printWriter.close();

      } catch (ExceptionEmployee | IOException exception) {
        System.out.println("Catch " + exception.getMessage());
      }
    }

  }
}
