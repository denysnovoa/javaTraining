package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class MainLambdaExerciseTwo {
  public static void main(String[] args) {
    String[] players = {"Rafa Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer"};

    Arrays.sort(players, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });

    Comparator<String> sortByName = (String s1, String s2) -> s1.compareTo(s2);
    Arrays.sort(players, sortByName);

    Arrays.sort(players, Comparator.naturalOrder());
  }

}
