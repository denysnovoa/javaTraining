package functionalInterface;

import gestion.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IContact {

  List<Person> persons = new ArrayList<>();

  default void add(String name, String surName, String email) {
    persons.add(new Person(name, surName, email));
  }

  default Person get(String email) {
    Optional<Person> person = persons.stream().filter(p -> p.getAddress().compareTo(email) == 0).findFirst();
    return person.orElse(null);
  }

  default void setByEmail(String email, String name, String surName) {
    Optional<Person> person = persons.stream().filter(p -> p.getAddress().equals(email)).findFirst();

    if (person.isPresent()) {
      person.get().setName(name);
      person.get().setSurName(surName);
    }
  }

  default List<Person> list() {
    return persons;
  }

  default void remove(String email) {
    Optional<Person> person = persons.stream().filter(p -> p.getAddress().compareTo(email) == 0).findFirst();
    person.ifPresent(persons::remove);
  }

  default void print() {
    persons.forEach(System.out::println);
  }
}
