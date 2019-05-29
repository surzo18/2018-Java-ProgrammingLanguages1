import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.*;

public class Main {

  public static void main(String[] args) throws IOException {
    Task9();
  }


  public static void Task1() throws IOException {
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream("files/Faust-Goethe.txt");
      out = new FileOutputStream("files/Faust-Goethe-Copy.txt");
      int length = 0;

      while ((length = in.read()) != -1) {
//                out.write(length);
        System.out.print(length);
        System.out.print((char) length);
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
  }

  public static void Task2() throws IOException {
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream("files/Faust-Goethe.txt");
      out = new FileOutputStream("files/Faust-Goethe-Copy.txt");
      byte[] buffer = new byte[1024];
      int length = 0;

      while ((length = in.read(buffer)) > 0) {
        System.out.println(buffer);
//                out.write(buffer, 0, length);
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
  }

  public static void Task3() throws IOException {
    FileReader in = null;
    FileWriter out = null;

    try {
      in = new FileReader("files/Faust-Goethe.txt");
      out = new FileWriter("files/Faust-Goethe-Copy.txt");
      int i = in.read();

      while (i != -1) {
        char character = (char) i;
        System.out.println(Character.toUpperCase(character));
//                out.write(Character.toUpperCase(character));
        i = in.read();
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
  }

  public static void Task4() throws IOException {
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream("files/Faust-Goethe.txt");
      out = new GZIPOutputStream(new FileOutputStream("files/Faust-Goethe-Compressed.txt.gz"));
      int length = 0;

      while ((length = in.read()) != -1) {
        out.write(length);
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
  }

  public static void Task5() throws IOException {
    BufferedReader in = null;
    PrintWriter out = null;

    try {
      in = new BufferedReader(new FileReader("files/Faust-Goethe.txt"));
      out = new PrintWriter(new FileWriter("files/Faust-Goethe-Lines.txt"));
      String line;
      int lineCount = 1;
      while ((line = in.readLine()) != null) {
//                out.println(line);
        System.out.print(lineCount++ + ": " + line);
        System.out.println();
      }
    } finally {
      if (in != null)
        in.close();
      if (out != null)
        out.close();
    }
  }

  public static void Task6() throws FileNotFoundException {
    Scanner in = new Scanner(new File("files/Faust-Goethe.txt"));
    while (in.hasNext()) {
      String word = in.next();
      System.out.println(word);
    }
  }

  public static void Task7() throws FileNotFoundException {
    Scanner in = new Scanner(new File("files/doubles.txt"));
    in.useLocale(Locale.GERMAN);

    double sum = 0;
    double count = 1;
    while (in.hasNext()) {
      double number = in.nextDouble();
      sum += number;
      count++;
    }
    System.out.println(sum / count);
  }

  public static void Task8() throws IOException {
    final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    final int[] units = {12, 8, 13, 29, 50};
    final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    DataOutputStream out = null;
    try {
      out = new DataOutputStream(new BufferedOutputStream(
              new FileOutputStream("files/data-output")));
      for (int i = 0; i < prices.length; i++) {
        out.writeDouble(prices[i]);
        out.writeInt(units[i]);
        out.writeUTF(descs[i]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      out.close();
    }


    DataInputStream in = null;
    double total = 0.0;
    try {
      in = new DataInputStream(new
              BufferedInputStream(new FileInputStream("files/data-output")));

      double price;
      int unit;
      String desc;

      while (true) {
        price = in.readDouble();
        unit = in.readInt();
        desc = in.readUTF();
        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                unit, desc, price);
        total += unit * price;
      }
    } catch (EOFException e) {

    } finally {
      in.close();
    }

    System.out.format("Total at $%.2f%n", total);
  }

  public static void Task9() throws IOException{
    try (ZipInputStream in = new ZipInputStream(new FileInputStream("files/Faust-Goethe.txt.zip"))) {
      BufferedReader read = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
      String tmp;
      FileOutputStream fileOutputStream = new FileOutputStream("files/Faust-Goethe-1250.txt.gz");
      Writer writer = new OutputStreamWriter(new GZIPOutputStream(fileOutputStream), "windows-1250");
      int i = 0;
      String out="";
      while ((tmp = read.readLine()) != null) {
         out += ++i + "; " + tmp.length() + "; " + tmp + "\n";
      }
      writer.write(out);
      writer.close();
      fileOutputStream.close();
    }
  }
}