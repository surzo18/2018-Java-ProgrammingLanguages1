import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IORoutines {
  public static String readPage(String url) {

    URL oracle;
    try {
      oracle = new URL(url);
      try (BufferedReader in =
                   new BufferedReader(new InputStreamReader(oracle.openStream()));) {
        StringBuilder sb = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
          sb.append(inputLine).append('\n');
        }
        in.close();
        return sb.toString();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
