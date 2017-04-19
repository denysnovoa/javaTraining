package calculator;

public class MainCalculator {

  public static void main(String args[]) {
    Calculator calculator = new Calculator(20, 11, '+');

    int result = calculator.getResult();

    System.out.println(result);

    System.out.println();
    System.out.printf("Number one is even %b ", calculator.getNumberIsEven(calculator.getNumberOne()));
    System.out.println();
    System.out.printf("Number two is even %b ", calculator.getNumberIsEven(calculator.getNumberTwo()));

  }
}
