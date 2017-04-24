package time.reservation;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManageCurrentMonth {

  private List<ReservationDay> reservationDays = new ArrayList<>();

  ManageCurrentMonth() {
    YearMonth month = YearMonth.now();

    for (int i = 0; i < month.lengthOfMonth(); i++) {
      reservationDays.add(new ReservationDay(LocalDate.of(month.getYear(), month.getMonth(), i)));
    }
  }

  public void bookDay(int day, Guest guest) {

    Optional<ReservationDay> first = reservationDays.stream()
        .filter(reservationDay -> reservationDay.getDate().getDayOfMonth() == day).findFirst();

    first.ifPresent(reservationDay -> reservationDay.bookDay(guest));

    for (ReservationDay reservationDay : reservationDays) {
      if (reservationDay.getDate().getDayOfMonth() == day) {
        reservationDay.bookDay(guest);
        break;
      }
    }
  }

}
