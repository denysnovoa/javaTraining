package thread;

public class TestExtendThread extends Thread {

  TestExtendThread() {
    super("Hilo hijo");

    System.out.println("El hilo hijo " + toString());
    start();
  }
}
