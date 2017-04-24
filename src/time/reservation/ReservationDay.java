package time.reservation;

import java.time.LocalDate;

public class ReservationDay {

  LocalDate date;
  Guest guest;
  Boolean isFree = true;

  public ReservationDay(LocalDate date, Guest guest) {
    this.date = date;
    this.guest = guest;
    this.isFree = false;
  }

  public void bookDay() {
    isFree = false;
  }

  public void freeDay() {
    isFree = true;
  }

}
