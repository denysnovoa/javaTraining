package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJdbcConnection {

  public static void main(String[] args) {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");

      String server = "jdbc:mysql://localhost:3306/test";

      String userName = "root";
      String userPassword = "";

      connection = DriverManager.getConnection(server, userName, userPassword);

      Statement statement = connection.createStatement();

      ResultSet resultSet = statement.executeQuery("SELECT * from empleados");

      while (resultSet.next()) {
        System.out.printf("Name: %s SurName: %s%n", resultSet.getString("Name"), resultSet.getString("surName"));
      }

    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Connection Susscefull: " + connection);

      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
