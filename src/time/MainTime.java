package time;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MainTime {

  public static void main(String[] args) {

    DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

    dayOfWeek.plus(8);

    Locale locale = new Locale("es");
    Month month = Month.DECEMBER;

    System.out.println();
    System.out.printf("Two month plus TextStyle.NARROW: %s%n", month.plus(2).getDisplayName(TextStyle.NARROW, locale));

    System.out.println();
    System.out.printf("A month ago it was TextStyle.SHORT: %s%n", month.minus(1).getDisplayName(TextStyle.SHORT, locale));

    System.out.printf("This month is TextStyle.FULL: %s%n", month.getDisplayName(TextStyle.FULL, locale));

  }
}
