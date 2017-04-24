package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZoneId;

public class MainDate {

  public static void main(String[] args) {

    MonthDay.of(Month.AUGUST, 20);

    YearMonth.of(1982, Month.APRIL);

    LocalDate.of(1923, 12, 22);

    LocalDateTime.of(1922, Month.APRIL, 22, 12, 22);

    System.out.printf("Local time America/Montreal: %s%n", LocalTime.now(ZoneId.of("America/Montreal")));

    System.out.printf("Local time America/New_York: %s%n", LocalTime.now(ZoneId.of("America/New_York")));

    System.out.printf("Local time Australia/Sydney: %s%n", LocalTime.now(ZoneId.of("Australia/Sydney")));

    System.out.printf("Local time Europe/London: %s%n", LocalTime.now(ZoneId.of("Europe/London")));
  }
}
