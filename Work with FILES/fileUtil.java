package net.atos.sofia.fileutils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileUtil {
    private String filePath = "";
    private String fileName = "";
    private String content = "";

    public fileUtil() {
    }

    public boolean saveFile(String filePath, String fileName, String content) {
        boolean retVal = true;
        this.filePath = filePath;
        this.fileName = fileName;
        this.content = content;

        try {
            Path path = Paths.get(filePath);

            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }

            Path file = Paths.get(filePath + File.separator+ fileName);
            BufferedWriter writer = Files.newBufferedWriter(file, Charset.forName("UTF-8"));

            writer.write(content);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
            retVal = false;
        }
        return retVal;
    }

    public String openFile(String fileName) {
        String retVal = "";

        Path path = Paths.get(fileName);
        try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
            String currentLine = null;
            while((currentLine = reader.readLine()) != null){//while there is content on the current line
                System.out.println(currentLine); // print the current line
                retVal += currentLine;
            }
        }catch(IOException ex){
            ex.printStackTrace(); //handle an exception here
        }
        return retVal;
    }
}