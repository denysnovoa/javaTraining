package file;

import java.util.Scanner;

public class MainFile {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.print("Enter the path files");

    FileWrapper fileWrapper = new FileWrapper(console.next());

    for (String file : fileWrapper.getFiles()) {
        System.out.println(file);
    }

  }
}
