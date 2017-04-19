package calculator;

public class Calculator {
  private static final char OPERATOR_SUM = '+';
  private int numberOne, numberTwo;
  private char operation = OPERATOR_SUM;

  public int getNumberOne() {
    return numberOne;
  }

  public void setNumberOne(int numberOne) {
    this.numberOne = numberOne;
  }

  public int getNumberTwo() {
    return numberTwo;
  }

  public void setNumberTwo(int numberTwo) {
    this.numberTwo = numberTwo;
  }

  public Calculator() {
    this.numberOne = 1;
    this.numberTwo = 2;
  }

  public Calculator(int numberOne, int numberTwo, char operation) {
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
    this.operation = operation;
  }

  public int getResult() {
    if (operation == OPERATOR_SUM) {
      return numberOne + numberTwo;
    }
    return 0;
  }

  public boolean getNumberIsEven(int number) {
    return number % 2 == 0;
  }
}
