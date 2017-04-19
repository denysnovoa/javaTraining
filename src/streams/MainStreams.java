package streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MainStreams {

  public static void main(String[] args) {

    try {
      FileWriter fileWriter = new FileWriter("pepe.txt");
      PrintWriter printWriter = new PrintWriter(fileWriter);

      printWriter.print("Esto es el texto de pepe " + LocalDate.now());
      printWriter.close();

    } catch (IOException e) {
      System.out.println("Error E/S");
    }

  }

}
