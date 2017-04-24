package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class MainDate {

  public static void main(String[] args) {

    MonthDay.of(Month.AUGUST, 20);

    YearMonth.of(1982, Month.APRIL);

    LocalDate.of(1923, 12, 22);

    LocalTime localTime = LocalTime.now();

    LocalDateTime localDateTime = LocalDateTime.now();


    LocalDateTime.of(1922, Month.APRIL, 22, 12, 22);


  }
}
