package time.reservation;

import java.time.LocalDate;

public class ReservationDay {

  LocalDate date;
  Guest guest;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Guest getGuest() {
    return guest;
  }

  public ReservationDay(LocalDate date) {
    this.date = date;
  }

  public void bookDay(Guest guest) {
    this.guest = guest;
  }

  public void freeDay() {
    guest = null;
  }

  public Boolean isFreeDay() {
    return guest == null;
  }

}
