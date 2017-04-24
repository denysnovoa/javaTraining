package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLambdaExerciseThree {

  public static void main(String[] args) {
    String[] players = {"Rafa Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer"};
    List<String> playersList = new ArrayList<>(Arrays.asList(players));

    System.out.println("---------------------");
    playersList.forEach(System.out::println);

    Comparator<String> sortBySurName = (String s1, String s2) -> s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")));
    Arrays.sort(players, sortBySurName);

    System.out.println(" sortBySurName ---------------------");
    playersList.forEach(System.out::println);

    Comparator<String> sortByNameLength = (String s1, String s2) -> s1.length() - s2.length();
    Arrays.sort(players, sortByNameLength);

    System.out.println("sortByNameLength ---------------------");
    playersList.forEach(System.out::println);

    Arrays.sort(players, Comparator.comparingInt(s -> s.charAt(s.length() - 1)));


    System.out.println("sortByLastLetter ---------------------");
    playersList.forEach(System.out::println);

  }
}
