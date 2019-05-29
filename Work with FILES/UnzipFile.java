package net.atos.sofia.fileutils;

import java.io.IOException;
import java.io.*;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class UnzipFile {

    private String inFile;
    private String outFolder;
    private int BUFFER_SIZE = 8192;

    public UnzipFile(String inFile, String outFolder){
        this.inFile = inFile;
        this.outFolder = outFolder;
        if (!this.outFolder.endsWith(File.separator)){
            this.outFolder += File.separator;
        }

        System.out.println("Packed file : "+ inFile+"   ouput folder : "+outFolder);
    }

    public void extract() throws IOException {
        final ZipFile file = new ZipFile(inFile);
        System.out.println("Iterating over zip file : " + inFile);

        try {
            final Enumeration<? extends ZipEntry> entries = file.entries();
            while (entries.hasMoreElements()) {
                final ZipEntry entry = entries.nextElement();
                System.out.printf("File: %s Size %d  Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));
                extractEntry(entry, file.getInputStream(entry));
            }
            System.out.printf("Zip file %s extracted successfully in %s", inFile, outFolder);
            file.close();

            File zf = new File(inFile);

            if (zf.delete()){
                System.out.println(zf.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }


        }catch(Exception e){

            e.printStackTrace();

        } finally {
            if (file != null) file.close();
        }

    }

    private void readUsingZipInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile));
        final ZipInputStream is = new ZipInputStream(bis);

        try {
            ZipEntry entry;
            while ((entry = is.getNextEntry()) != null) {
                System.out.printf("File: %s Size %d  Modified on %TD %n", entry.getName(), entry.getSize(), new Date(entry.getTime()));
                extractEntry(entry, is);
            }
        } finally {
            is.close();
        }

    }

    private  void extractEntry(final ZipEntry entry, InputStream is) throws IOException {
        String exractedFile = outFolder + entry.getName();
        System.out.println("extractEntry.exractedFile   :   "+exractedFile);
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(exractedFile);
            final byte[] buf = new byte[BUFFER_SIZE];
            int read = 0;
            int length;

            while ((length = is.read(buf, 0, buf.length)) >= 0) {
                fos.write(buf, 0, length);
            }

        } catch (IOException ioex) {
            fos.flush();
            fos.close();
        }

    }
}


