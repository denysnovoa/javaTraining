package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

  public class StreamsWrapper {

  public FileInfo getInfo(String path) throws FileNotFoundException {
    File file = new File(path);

    if (!file.exists())
      throw new FileNotFoundException("File not exits");

    return new FileInfo(file);
  }

  public String getContent(String path) throws IOException {
    File file = new File(path);

    if (!file.exists() && file.isFile())
      throw new IOException("File not exits");

    return file.toString();
  }

  public void save(String content, String path) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    PrintWriter printWriter = new PrintWriter(fileWriter);

    printWriter.print(content);
    printWriter.close();
  }

  public String getFromUrl(String url) throws IOException {

    URL fileUrl = new URL(url);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileUrl.openStream()));

    StringBuilder stringBuffer = new StringBuilder();
    String inputLine;

    do {
      inputLine = bufferedReader.readLine();

      stringBuffer.append(inputLine);
    } while (inputLine != null);

    bufferedReader.close();

    return stringBuffer.toString();
  }

  public void saveToUrl(String path, String url) throws IOException {
    URL urlFile = new URL(url);

    ReadableByteChannel readableByteChannel = Channels.newChannel(urlFile.openStream());
    FileOutputStream fileOutputStream = new FileOutputStream(path);

    fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
  }

  public Elements getLinksWithJsoap(String url) throws IOException {
    Document document = Jsoup.connect(url).get();
    return document.select("a[href]");
  }
}
