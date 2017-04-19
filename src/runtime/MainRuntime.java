package runtime;

import java.io.IOException;

public class MainRuntime {

  public static void main(String[] args) {

    try {
      Runtime.getRuntime().exec("/usr/bin/open -a TextEdit.app").waitFor();

      System.out.printf("Memory Free %s ", Runtime.getRuntime().freeMemory());
      System.out.printf("Memory Total %s ", Runtime.getRuntime().totalMemory());


    } catch (InterruptedException | IOException e) {
      e.printStackTrace();
    }
  }
}
