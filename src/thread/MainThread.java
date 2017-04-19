package thread;

public class MainThread {

  public static void main(String[] args) {

    TestThread testThread = new TestThread();

    TestExtendThread testExtendThread = new TestExtendThread();
    testExtendThread.setPriority(2);

    TestExtendThread testExtendThread2 = new TestExtendThread();
    testExtendThread2.setPriority(23);


    TestExtendThread testExtendThread3 = new TestExtendThread();
    testExtendThread3.setPriority(1);


    for (int i = 5; i > 0; i--) {
      System.out.println("El hilo padre escribe: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("father is Dead");
  }
}
