import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class ExampleAdvanced {

  private static final int LESS_YEAR = 1980;

  public static void main(String[] args) {
    Scanner consoleScanner = new Scanner(System.in);

    LocalDate birthDate;

    String name = getNameFromConsole(consoleScanner);

    birthDate = getBirthDateLessYear(consoleScanner, LESS_YEAR);

    showBetweenDates(birthDate);
  }

  private static LocalDate getBirthDateLessYear(Scanner consoleScanner, int year) {
    String dateInText;
    LocalDate birthDate;
    do {
      System.out.printf("Please enter your birth date %s year", year);

      dateInText = getBirthDateFromConsole(consoleScanner);
      birthDate = getDateFromConsole(dateInText);

    } while (birthDate.getYear() < year);
    return birthDate;
  }

  private static void showBetweenDates(LocalDate birthDate) {
    LocalDate dateNow = LocalDate.now();
    Period datePeriod = Period.between(birthDate, dateNow);

    System.out.printf("Your date is: %s year, %s month and %s day", datePeriod.getYears(), datePeriod.getMonths()
        , datePeriod.getDays());
  }

  private static String getBirthDateFromConsole(Scanner consoleScanner) {
    System.out.println();
    return consoleScanner.next();
  }

  private static String getNameFromConsole(Scanner consoleScanner) {
    System.out.println("Hello user, please enter your name");
    return consoleScanner.next();
  }

  private static LocalDate getDateFromConsole(String dateInText) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return parse(dateInText, dateTimeFormatter);
  }
}
