package thread;

public class TestThread implements Runnable {
  private Thread thread;

  @Override
  public void run() {
    thread = new Thread(this, "Hilo hijo creado");
    System.out.println("El hilo hijo es " + thread.toString());
    thread.start();
  }

}
