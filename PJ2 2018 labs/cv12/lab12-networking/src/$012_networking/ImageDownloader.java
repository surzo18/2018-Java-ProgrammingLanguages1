/*******************************************************************************
 * KoĹľusznik Jan
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

package $012_networking;

import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jan KoĹľusznik
 * @version 0.1
 */
public class ImageDownloader {
  private URL url;

  /**
   * @param url
   * @throws MalformedURLException
   */
  public ImageDownloader(String url) throws MalformedURLException {
    this.url = new URL(url);
  }

  public void doIt() throws IOException {
    BufferedReader in = null;
    try {

      // Task 1
      StringBuilder sb = new StringBuilder();
      in = new BufferedReader(
              new InputStreamReader(url.openStream()));

      String inputLine;
      while ((inputLine = in.readLine()) != null)
        sb.append(inputLine);
      String html = sb.toString();


      // Task 2
      String regex = "<img\\s+class=\"[a-z]*\"\\s+src=\"([^\\\"]*)\"\\s+alt=\"[a-zA-Z]*\"\\s+width=\"\\d*\"\\s+height=\"\\d*\">";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(html);

      List<String> urls = new ArrayList<>();
      while (matcher.find()) {
        for (int i = 1; i <= matcher.groupCount(); i++) {
          String url = matcher.group(i);
          urls.add(url);
        }
      }

      // Task 3
            InputStream imageIn = null;
            OutputStream imageOut = null;
            try {
                for (String url : urls) {
                    String fileName = url.substring(url.lastIndexOf("/") + 1);
                    imageIn = new URL(url).openStream();
                    imageOut = new FileOutputStream(fileName);

                    byte[] bytes = new byte[2048];
                    int length;
                    while ((length = imageIn.read(bytes)) != -1) {
                        imageOut.write(bytes, 0, length);
                    }
                }
            } finally {
                imageIn.close();
                imageOut.close();
            }

      // Task 4
      for (String url : urls) {
//                Thread thread = new Thread(new DownloadImage(url));
//                thread.start();

                Thread thread = new Thread(() -> {
                    System.out.println("Downloading: " + url);
                    InputStream imageIn = null;
                    OutputStream imageOut = null;
                    try {
                        String fileName = url.substring(url.lastIndexOf("/") + 1);
                        imageIn = new URL(url).openStream();
                        imageOut = new FileOutputStream(fileName);

                        byte[] bytes = new byte[2048];
                        int length;
                        while ((length = imageIn.read(bytes)) != -1) {
                            imageOut.write(bytes, 0, length);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            imageIn.close();
                            imageOut.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Downloaded: " + url);
                });
                thread.start();
      }

    } finally {
      if (in != null)
        in.close();
    }
  }
}

// Task 4
class DownloadImage implements Runnable {
  String url;

  public DownloadImage(String url) {
    this.url = url;
  }

  @Override
  public void run() {
    System.out.println("Downloading: " + url);
    InputStream imageIn = null;
    OutputStream imageOut = null;
    try {
      String fileName = url.substring(url.lastIndexOf("/") + 1);
      imageIn = new URL(url).openStream();
      imageOut = new FileOutputStream(fileName);

      byte[] bytes = new byte[2048];
      int length;
      while ((length = imageIn.read(bytes)) != -1) {
        imageOut.write(bytes, 0, length);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        imageIn.close();
        imageOut.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Downloaded: " + url);
  }
}
