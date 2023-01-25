package org.structuralPattern.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String es,String path){
        System.out.println("写入文件");
        try(FileOutputStream fileOutputStream = new FileOutputStream(path)){
            fileOutputStream.write(es.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
