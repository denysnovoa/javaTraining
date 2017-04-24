package lambdas;

import java.util.Arrays;
import java.util.List;

public class MainLambdaExerciseOne {

  public static void main(String[] args) {
    String[] atp = {"Rafa Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer"};
    List<String> players = Arrays.asList(atp);

    for (String player : players) {
      System.out.println(player);
    }

    System.out.println();
    players.forEach((player) -> System.out.println(player));

    System.out.println();
    players.forEach(System.out::println);

  }
}
