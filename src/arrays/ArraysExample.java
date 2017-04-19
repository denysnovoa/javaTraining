package arrays;

import calculator.Calculator;
import java.util.Arrays;

public class ArraysExample {

  public static void main(String args[]) {
    Calculator calculator = new Calculator();

    int[] arrayNumbers = {1, 2, 3, 4, 5, 9, 7, 8};

    for (int number : arrayNumbers) {
      System.out.println();
      System.out.printf("The value %s is even %b", number, calculator.getNumberIsEven(number));
    }

    System.out.println();
    System.out.printf("This array is sorted %b", isOrderAsc(arrayNumbers));

    System.out.println();
    System.out.printf("The min number is %s ", getMinNumber(arrayNumbers));

    System.out.println();
    System.out.printf("The max number is %s ", getMaxNumber(arrayNumbers));

  }

  private static boolean isOrderAsc(int[] array) {
    int[] arraySort = array.clone();
    Arrays.parallelSort(arraySort);

    return Arrays.equals(array, arraySort);
  }

  private static int getMinNumber(int[] array) {

    int[] arraySort = array.clone();
    Arrays.parallelSort(arraySort);

    return arraySort[0];
  }

  private static int getMaxNumber(int[] array) {

    int[] arraySort = array.clone();
    Arrays.parallelSort(arraySort);

    return arraySort[arraySort.length -1];
  }
}
