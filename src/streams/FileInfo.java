package streams;

import java.io.File;

public class FileInfo {

  String path, name, absolutePath;
  Boolean readPermission, writePermission, isFile, isDir;
  long lastAlter;
  long fileSize;

  public String getPath() {
    return path;
  }

  public String getName() {
    return name;
  }

  public String getAbsolutePath() {
    return absolutePath;
  }

  public Boolean getReadPermission() {
    return readPermission;
  }

  public Boolean getWritePermission() {
    return writePermission;
  }

  public Boolean getFile() {
    return isFile;
  }

  public Boolean getDir() {
    return isDir;
  }

  public long getLastAlter() {
    return lastAlter;
  }

  public FileInfo(File file) {
    this.path = file.getPath();
    this.name = file.getName();
    this.absolutePath = file.getAbsolutePath();
    this.readPermission = file.canRead();
    this.writePermission = file.canWrite();
    this.isFile = file.isFile();
    this.isDir = file.isDirectory();
    this.lastAlter = file.lastModified();
    this.fileSize = file.getTotalSpace();
  }

  public FileInfo(String path, String name, String absolutePath, Boolean readPermission, Boolean writePermission, Boolean isFile
      , Boolean isDir, long lastAlter, long fileSize) {
    this.path = path;
    this.name = name;
    this.absolutePath = absolutePath;
    this.readPermission = readPermission;
    this.writePermission = writePermission;
    this.isFile = isFile;
    this.isDir = isDir;
    this.lastAlter = lastAlter;
    this.fileSize = fileSize;
  }
}
