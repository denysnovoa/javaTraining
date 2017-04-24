package collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainComparatorUser {

  public static void main(String[] args) {

    List<User> users = new ArrayList<>();

    users.add(new User("pepe1", LocalDate.of(1980, Month.AUGUST, 12)));
    users.add(new User("pepe2", LocalDate.of(1983, Month.APRIL, 13)));
    users.add(new User("pepe3", LocalDate.of(1985, Month.FEBRUARY, 23)));
    users.add(new User("pepe4", LocalDate.of(1970, Month.DECEMBER, 20)));

    users.forEach((User) -> System.out.println((User).getName() + " ; "));

    System.out.println();

    users.sort(new ComparatorUser());

    users.forEach((User) -> System.out.println((User).getName() + " ; "));

    System.out.println();

    users.sort(Comparator.comparingInt(User::getAge));

    users.forEach((User) -> System.out.println((User).getName() + " ; "));

    System.out.println();

    users.sort(Comparator.comparing(User::getName));

    users.forEach((User) -> System.out.println((User).getName() + " ; "));
  }
}
