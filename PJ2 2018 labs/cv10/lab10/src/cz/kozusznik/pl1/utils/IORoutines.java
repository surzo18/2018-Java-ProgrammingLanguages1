/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class IORoutines {
  public static String readFile(String fileName) {
    try {
      return new String(Files.readAllBytes(Paths.get(fileName)));
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

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
