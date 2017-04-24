package collections;

import java.util.Comparator;

public class ComparatorUser implements Comparator<User> {

  @Override
  public int compare(User userOne, User userTwo) {
    return userOne.getAge() - userTwo.getAge();
  }
}
