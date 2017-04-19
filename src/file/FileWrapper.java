package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileWrapper {
  String path;

  public FileWrapper(String path) {
    this.path = path;
  }

  public List<String> getFiles() {
    File files = new File(path);
    List<String> filePath = new ArrayList<>();

    for (File file : files.listFiles()) {
      if (file.isFile())
        filePath.add(file.getPath());
    }

    return filePath;
  }


}
